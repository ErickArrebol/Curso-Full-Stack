/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/

let numeroLimit = prompt("Ingresa un numero limite");
var suma = 0;

for (let index = 0; index < numeroLimit; index++) {
    let numero = prompt("Ingresa un numero");
    suma += parseInt(numero);
    
    if (suma > parseInt(numeroLimit)) {
        console.log("Fin del programa");
        break; 
    }
}