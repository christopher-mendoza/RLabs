// Object Literal
let person = {
    name:"Chris",
    age:103,
    sayHello:() => {console.log("KomodoHype")}
}

console.log(person);
console.log(person.name);
console.log(person.age);
console.log(person.sayHello);

person.sayHello();
person.name = "Christopher";
console.log(person.name);

// Objects are not limited to just the properties you define them with
person.favoriteAnimal = "Otter";
console.log(person);

// Constructors exist, they are just functions
function Person(name, age, skill) {
    this.name = name;
    this.age = age;
    this.skill = skill;
}

let dan = new Person("Dan", 1010, "Trainer");
let gamer = new Person("Pog", 10, "Gamer");

console.log(dan);
console.log(gamer);

console.log(typeof person);
console.log(typeof dan);

// JSON
let danJson = JSON.stringify(dan);
console.log(danJson);
console.log(typeof danJson);

let parsedDan = JSON.parse(danJson);
console.log(parsedDan);
console.log(typeof parsedDan);