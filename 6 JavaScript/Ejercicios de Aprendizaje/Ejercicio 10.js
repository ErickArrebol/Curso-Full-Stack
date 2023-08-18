/*Escribir una función flecha que reciba una palabra y la devuelva al revés. */

// split('') divide la palabra en un array de caracteres individuales.
// reverse() invierte el orden de los elementos en el array.
// join('') une los caracteres del array en una cadena, formando la palabra al revés.

let frase = prompt("Ingresa un frase");

const funcion = (frase)=>{
    return frase.split('').reverse().join('');
}

const fraseAlreves =funcion(frase);
console.log(fraseAlreves);