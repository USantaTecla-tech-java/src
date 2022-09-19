const { Console } = require("./console");

const console = new Console();
const base = console.readNumber("Dame una base: ");
const exponent = console.readNumber("Dame un exponente: ");
console.writeln(`La base ${base} elevada al exponente ${exponent} es ${power(base, exponent)}`);

function power(base, exponent) {
  if (exponent < 0) {
    return 1 / power(base, -exponent);
  }
  return accPower(base, exponent, 1);

  function accPower(base, exponent, acc) {
    return exponent === 0 ? acc : accPower(base, exponent - 1, acc * base);
  }
}
