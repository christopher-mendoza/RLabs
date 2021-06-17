// There are several ways to create functions in JavaScript

// Functions are hoisted to the top of the code

// 1st Way - most OOP way
hello();
function hello() {
    console.log("Hello");
}
hello();

// 2nd Way
// Anonymous function (there is no name between function keyword and ())
let hey = function () {
    console.log("Hey");
}
console.log(hey);
hey();

x = 15;
x = function() {
    console.log(x);
}
x();

function add(num1, num2) {
    return (num1 + num2);
}

console.log(add(9, 10));
console.log(add("hello", "world"));

// 3rd Way
// Arrow notation
let sup = () => {
    console.log("Sup");
}
sup();

// Callback Function: Function being used as a parameter of another function
function greetings(greet1, greet2) {
    greet1();
    greet2();
}
greetings(sup, hey);
// greetings(123, 456); // Does not work
greetings(hello, () => { console.log("goodbye"); });

function calc(num1, num2, op1, op2) {
    if(op1) {
        console.log(op1(num1, num2));
    }
    if(op2) {
        console.log(op2(num1, num2));
    }
}
calculate(9, 10, add);

// Self-invoking functions
(function () {
    console.log("I will be self-invoked!");
})();