/*Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
todos ellos. */
let numero = 0;
var conteo = 0;
var suma = 0;
let min=0;
let max =0;
do {
    numero = parseInt( prompt("Ingresa un numero"));
    if(Number.isNaN(numero)){
        alert("Ingresa solo numeros")
    }else{
        (conteo == 0)? (min = numero, max = numero) : null;
        (numero > max) ? max = numero : (numero < min && numero !== 0) ? min = numero : null;
        suma+=numero;
        conteo ++;
    }
} while (numero!= 0);

alert(`La suma es ${suma}
La cantidad ingresados es ${conteo-1}
El numero Minimo ${min}
El numero Maximo ${max}
El promedio es ${suma/(conteo-1)}`);

