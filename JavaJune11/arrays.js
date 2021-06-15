let number = [10, 20, 30, 40, 50];
console.log(number);

// pop() - will remove the last element
console.log("Pop: " + number.pop());
console.log(number);

// push() - Will add element(s) to the end of the array
console.log("Push: " + number.push(60));
console.log(number);

console.log("number[0]: " + number[0]);
console.log(number);

// There is no enforcement of what data types can be accepted into an array
let array = [1, 2, "Chris", null, undefined, [1,2,3], {}, function() {}, Date];
console.log(array);

let names = ["Dan", "Ryan", "Jessica", "Richard", "Nick"];
console.log(names);
console.log("Sorting names");
console.log(names.sort());

// forEach()
names.forEach(name => console.log(name));
for(let i = 0; i < 10; i++) {
    console.log(i);
}

for(let name in names) {
    console.log(name);
}

for(let name of names) {
    console.log(names);
}