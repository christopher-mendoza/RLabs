// Declaring a variable
let myVar;

// To print information to our console
// we use console.log();
// to determine the type of a variable we use typeof
console.log(myVar);
console.log(typeof myVar);

myVar = 100;

console.log(myVar);
console.log(typeof myVar);

myVar = "Word";

console.log(myVar);
console.log(typeof myVar);

myVar = false;

console.log(myVar);
console.log(typeof myVar);

myVar = null;

console.log(myVar);
console.log(typeof myVar);

// JS engages in Type coercion to determine if two vriables are equivalent
// it disregards their type (==)
console.log(10 == 10);
console.log(10 == "10");
console.log(5 != "5");
console.log("::::::::::::::::::::::::");

// to not enforce type comparison (===)
console.log(10 === 10);
console.log(10 === "10");
console.log(10 === '10');
console.log(5 !== "5");

/**
 * JavaScipt has truthy and falsy values.
 * 
 * these are values that evaluate to either true or false
 * 
 * 2 aspects to think about here
 * - Be used in condition: if(condition), while(condition)
 * - Be used in type coercion: 0 == false;
 * 
 */

if(true) {
    console.log("if (true)");

}

if(false) {
    console.log("if (false)");
}

if(1) {
    console.log("if(1)"); // 1 has a truthy value
}

if(0) {
    console.log("if(0)"); // 0 is a falsy value
}



// Non-zero numbers are truthy values **IN CONDITIONAL STATEMENTS**
if(255) {
    console.log("if(255)");
}

if(-1) {
    console.log("if(-1)");
}

if(-123) {
    console.log("if(-123)");
}




// IN CONDITIONS - null and undefined are falsy
if(null) {
    console.log("if(null)");
}

if(undefined) {
    console.log("if(undefined)");
}




if("") {
    console.log("if(\'\')"); // empty strings are falsy
}

if("string"){
    console.log("if(stringAsAString)"); // non-empty strings are truthy
}

if("0") {
    console.log("if(0AsAString)");
}

console.log("::::::::::::::::::::::::::::::::::");
// Truthy/Falsy in type coercion
console.log(true == true);
console.log(false == false);
console.log(false == true);
console.log("........................");
console.log(true == 1);
console.log(false == 0);
console.log("0" == 0);
console.log(false == "0");
console.log(".........................");
// null and undefined are not truthy or falsy values in type coercion
console.log(true == null);
console.log(true == undefined);
console.log(false == null);
console.log(false == undefined);

// null and undefined are equal to themselves and eachother
console.log(null == undefined);
console.log([] == {}); // empty array != empty object

console.log("10" - "5");
console.log("word" - "something else");

// NaN
console.log(typeof NaN);
console.log(NaN == NaN);

