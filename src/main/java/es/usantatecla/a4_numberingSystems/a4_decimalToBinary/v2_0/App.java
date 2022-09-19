// package es.usantatecla.a4_numberingSystems.a4_decimalToBinary.v1_0;

// import es.usantatecla.utils.Console;

// public class App {

//   public static void main(String[] args) {
//     Console console = new Console();
//     int number = console.readInt("Dame un número inferior a 16: ");
//     String binary = "";
//     for (int i = 0; i < 32; i++) {
//       binary = (number & 1) + binary;
//       if ((i + 1) % 4 == 0) {
//         binary = " " + binary;
//       }
//       number >>= 1;
//     }
//     console.writeln("Formato binario: " + binary);
//   }

// }

// let number = console.readNumber(`Dame un número decimal: `);
// console.writeln(`Formato binario de ${number}: ${toBinary(number)}`);
// for(let i=1; i<=5; i++){
//   console.writeln(`Formato binario de ${number} << ${i} (${number << i}): ${toBinary(number << i)}`);
// }
// for(let i=1; i<=5; i++){
//   console.writeln(`Formato binario de ${number} >> ${i} (${number >> i}): ${toBinary(number >> i)}`);
// }
// for(let i=1; i<=5; i++){
//   console.writeln(`Formato binario de ${number} >>> ${i} (${number >>> i}): ${toBinary(number >>> i)}`);
// }

// function toBinary(number) {
//   const MAX_DIGIT = 32;
//   let binary = "";
//   for (let i = 0; i < MAX_DIGIT; i++) {
//     binary = (number & 1) + binary;
//     if ((i + 1) % 4 == 0) {
//       binary = " " + binary;
//     }
//     number >>= 1;
//   }
//   return binary;
// }