package es.usantatecla.a0_itinerario.a1_imperativa.a3_operadores.a2_conversion;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
       /* operador con conversión de tipos */
//console.writeln(5 == "5"); // true
//console.writeln(5 != "5"); // false
    
/* operador sin conversión de tipos */
//console.writeln(5 === "5"); // false
//console.writeln(5 !== "5"); // true   
// console.writeln(- "-666"); //666
// console.writeln(- "sin formato numérico"); //NaN
// console.writeln(- false); //-0
// console.writeln(- true); //-1
// console.writeln(- undefined); //NaN
console.writeln("" + -1.2345e4); // -12345
// console.writeln("" + NaN); // NaN
console.writeln("1" + 2); // 12
console.writeln(1 + "2"); // 12
console.writeln("" + true); // true
console.writeln("" + false); // false
// console.writeln("" + undefined); // undefined

// console.writeln(! -55.55); // false
// console.writeln(! 0); //true
// console.writeln(! NaN); //true
// console.writeln(! ""); //true
// console.writeln(! "cadena"); //false 
// console.writeln(! undefined); //true  
    }
}