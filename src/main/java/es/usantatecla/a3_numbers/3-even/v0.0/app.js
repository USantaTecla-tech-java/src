const { Console } = require("./console");

const console = new Console();
const number = console.readNumber("Escribe un número? ");
const remainder = number % 2;
console.writeln(`El numero ${number} es ${remainder == 0 ? "par" : "impar"}`);

