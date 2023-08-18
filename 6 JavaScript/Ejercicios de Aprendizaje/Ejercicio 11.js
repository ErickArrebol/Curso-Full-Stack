/*Escribir una función que reciba un String y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript” */

const frase = "Guia de JavaScript";
palabraMasLarga(frase);
function palabraMasLarga(frase) {
    const palabras = frase.split(" ");
    let palabraMasLarga = "";
    for (let palabra of palabras) {
        (palabra.length > palabraMasLarga.length)? palabraMasLarga = palabra:null;
    }
    console.log(palabraMasLarga); 
}

