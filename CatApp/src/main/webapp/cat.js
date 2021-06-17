function getData() {
    let url = 'http://locahost:8080/CatAppServlet/cats';
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = receiveData;
    xhttp.open('GET', url, true);
    xhttp.send();

    /**
     * For POST REQUESTS
     * xhttp.open('POST', url, true);
     * xhttp.setRequestHeader('Content-Type', 'application/json');
     * xhttp.send(json.stringify(Object));
     */

    /**
     * To make a json from user input
     * collect input (let input = document.get...().value;)
     * 
     * create an object
     * let cat = {
     *  name: input,
     *  another-value: something
     * }
     */

    function receiveData() {
        if(xhttp.readyState == 4 && xhttp.status == 200) {
            let res = xhttp.responseText;
            console.log(res);

             res = JSON.parse(res);
             console.log(res);

             // Create a table
             let catTable = document.createElement('table');
             catTable.id = 'catTable';

             // We will need: <tr> table row
                            //<td> for each piece of data in that row
                            //<th> for the header
            // Create table header row
            let thRow = document.createElement('tr');
            let tHeaders = ['Name', 'Age', 'Breed'];
            for(let h of tHeaders) {
                let th = document.createElement('th');
                th.innerHTML = h;
                thRow.appendChild(th);
            }
            catTable.append(thRow);

            // Iterate through the cats and create a table row with the tabl data we want to show
            for(let cat in res) {
                // Row for each cat
                let tr = document.createElement('tr');
                // cat name
                let tdName = document.createElement('td');
                tdName.innerHTML = cat.name;
                tr.appendChild(tdName);

                // cat age
                let tdAge = document.createElement('td');
                tdAge.innerHTML = cat.age;
                tr.appendChild(tdAge);

                // cat breed
                let tdBreed = document.createElement('td');
                tdBreed.innerHTML = cat.breed;
                tr.appendChild(tdBreed);

                catTable.appendChild(tr);
            }

            
            dataSection.appendChild(catTable);

        }
    }
}