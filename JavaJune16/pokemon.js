// let section = document.getElementById('data');
// let newP = document.createElement('p');
// newP.setAttribute('id', 'newP');
// section.appendChild(newP);
// newP.innerHTML = "I'm a new paragraph!";

/**
 * BEGIN POKEMON PORTION
 */

// Endpoint you are sending a GET request to
let apiURL = 'https://pokeapi.co/api/v2/pokemon/';

// Add event listener
document.getElementById('getData').onclick = getData;
function getData() {
    console.log('clicked button');

    // If using input for identifiers (i.e. Pokemon's id)
    // Save that value into a variable
    let userInput = document.getElementById('dataInput').value;

    // 4 Steps to building an AJAX call
    // Step 1: Create a XMLHttpRequest Object
    let xhttp = new XMLHttpRequest();

    // Step 2: Set a callback function for the readystatechange event
    xhttp.onreadystatechange = receiveData;

    // Step 3: Open the request
    if(userInput > 0) {
        xhttp.open('GET', apiURL + userInput, true);

        // STEP 4: Send the request
        xhttp.send();
    }
    else {
        console.log('Cannot find that pokemon!');
    }
    
    // Callback function
    function receiveData() {
        /**
         * Different ready states of an XMLHttpRequest objet
         * 
         * 0: UNSENT (and unopened)
         * 1: OPENED
         * 2: HEADERS RECEIVED
         * 3: LOADING
         * 4: DONE
         * 
         */
        // Get the element we want to manipulate
        // Empty existing data in section (if any)
        let dataSection = document.getElementById('data');
        dataSection.innerHTML = '';
        // If readyState is DONE and HTTP status is 'OK'
        if(xhttp.readyState == 4 && xhttp.status == 200) {
            let resp = xhttp.responseText;
            resp = JSON.parse(resp);

            // Populate our page with data
            populateData(resp);

        }
        else {
            // readyState is NOT DONE
            // some error handling
        }
    }
}

function populateData(resp) {
    let dataSection = document.getElementById('data');

    // Adding name of pokemon
    let nameTag = document.createElement('h3');
    nameTag.innerHTML = 'Name: ' + capitalize(resp.name);
    dataSection.appendChild(nameTag);

    // Adding abilities
    dataSection.innerHTML += '<h4>Abilities:<br></h4>'
    let abilitiesArray = resp.abilities;
    let abilities = document.createElement('ul');
    // Iterate over list and create list items
    for(let ability of abilitiesArray) { // 'of' uses object to iterate
        let abilityElement = document.createElement('li');
        abilityElement.innerHTML = capitalize(ability.ability.name);
        abilities.appendChild(abilityElement);
    }
    dataSection.appendChild(abilities);

    // Adding sprite images
    let spriteArray = resp.sprites;
    for(let sprite in spriteArray) { // 'in' uses indexes
        if(spriteArray[sprite]) {
            let spriteImg = document.createElement('img');
            spriteImg.setAttribute('src', spriteArray[sprite]);
            dataSection.appendChild(spriteImg);
        }
    }
    dataSection.removeChild(dataSection.lastChild);
    dataSection.removeChild(dataSection.lastChild);
}

// Function to capitalize first letters
function capitalize(str) {
    if(str) {
        return str.charAt(0).toUpperCase() + str.slice(1);
    } else {
        return '';
    }
}