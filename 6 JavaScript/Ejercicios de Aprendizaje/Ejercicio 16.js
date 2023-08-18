/*Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
y los muestre por pantalla. */

// Math.random(): Genera un número decimal aleatorio entre 0 (inclusive) y 1 (exclusivo).
// (100 - 1): Calcula el rango de números que quieres obtener.
// Math.floor(...): Redondea el número hacia abajo, para asegurarte de obtener un número entero
//+ 1: Suma el valor mínimo para desplazar el rango de números aleatorios.

let vector1 = [];
let vector2 = [];
for (let index = 0; index < 5; index++) {
    vector1[index]= Math.floor(Math.random() * (100 - 1) + 1);
    vector2[index]= Math.floor(Math.random() * (100 - 1) + 1);
}
console.log(vector1);
console.log(vector2);