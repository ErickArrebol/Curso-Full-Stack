/*Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
En caso de  que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”. */


// let numero = 6;
let numero=0;
do {
     numero= parseInt(prompt("Ingresa un numero"));

    (Number.isNaN(numero))?console.log("El valor ingresado no es un número"): 
    (numero % 2 === 0)?console.log("El numero es Par"):
    (numero % 2 !== 0)?console.log("El numero es impar"):
    (numero === 0)? console.log("El número no es par ni impar es 0"):null;
    
} while (Number.isNaN(numero));