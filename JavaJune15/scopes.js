// In Javascript we define the scope of a variable

/**
 * 3 Main Scopes in JavaScript
 * 
 * Block Scope: A variable is only available within that block of code
 * 
 * Function Scope: A variable is available within a function and any nested functions
 * 
 * Global Scope: A variable is available anywhere in the program
 * 
 * *we use keywords to define a variable scope*
 */


// BLOCK Scope - keywords 'let' and 'const'
// const always need to be assigned a value and cannot be reassigned
let a = 101;
const b = 999;

console.log(a);
console.log(b);

if(true) {
    const d = 111;
    a = 10;
    var b = 11; 
    let c = 12;

    console.log(a);
    console.log(b);
    console.log(c);
    console.log(d);
}
/**
 * 'var' keyword is used to declare function scope for a variable
 * We can use this variable outside of the function in which it was defined
 * Hoisting: Brought to the top where it is read so later on it will not cause errors
 *          variable will be declared, but not assigned until assignment
 */