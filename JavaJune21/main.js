// All JavaScript is valid TypeScript
// function log(message) {
//     console.log(message);
// }
// let message = "Hello World!";
// console.log(message);
// Declaring Variables
// var number = 1;
// let count = 2;
// function doSomething() {
//     for(var i = 0; i < 5; i++) {
//         console.log(i);
//     }
//     console.log(i);
// }
// doSomething();
// let count = 5;
// count = 'a'; // compilation error in TypeScript, but will still compile into valid JavaScript
// let a: any;
// a = 1;
// a = true;
// a = 'a';
// let b: number;
// b = 1;
// // b = true; // These will give us compile time errors
// // b = 'b';
// let c: boolean;
// let d: string;
// let arr: number[] = [1,2,3];
// // Type Assertion
// let message;
// message = 'abc';
// let endsWithC = (<string>message).endsWith('c'); // way #1
// // Does not change the variable type at runtime.
// // Tells TypeScript Compiler what type of variable we are using
// let alternativeWay = (message as string).endsWith('c'); // way #2
// // Arrow Notations
// // JavaScript way
// let log = function(message) {
//     console.log(message);
// }
// // Typescript way
// let doLog = (message: string) => { console.log(message); }
// interface Point {
//     x: number,
//     y: number,
//     // draw: () => {}
// }
// let point = {
//     x: 1,
//     y: 2
// }
// let drawPoint = (point: Point) => {
//     console.log(point.x + ", " + point.y);
// }
//drawPoint({x: 1, y: 2});
class Point {
    // Implicitly public
    // x: number
    // y: number
    // ONLY ONE CONSTRUCTOR PER CLASS
    // To get around this, we can make parameters optional
    // Once a parameter is optional, every other parameter to the right is as well
    constructor(_x, _y) {
        this._x = _x;
        this._y = _y;
        // this.x = x;
        // this.y = y;
    }
    drawPoint() {
        console.log('X: ' + this._x + ', Y: ' + this._y);
    }
    // Getters and Setters
    // getX() {
    //     return this.x;
    // }
    // setX(x: number) {
    //     this.x = x;
    // }
    getY() {
        return this._y;
    }
    setY(y) {
        this._y = y;
    }
    get x() {
        return this._x;
    }
    set x(x) {
        if (x < 0) {
            throw new Error("x cannot be less than 0!");
        }
        else {
            this._x = x;
        }
    }
}
let p1 = new Point(1, 2);
// p1.x = 3;
// p1.y = 4;
p1.drawPoint();
p1.x; // this is using our getter
p1.x = 5; // this is our setter
let p2 = new Point();
