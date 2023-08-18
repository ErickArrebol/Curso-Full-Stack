/*Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
que di ga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.*/

//var caracter = prompt("Introducir los caracteres ‘S’ y ‘N’").toUpperCase();

    let caracter = "";
    let finalizar = true;
    do {
        caracter= prompt('Ingresa un caracter').toUpperCase();
        (caracter === 'S' || caracter === 'N')?(console.log("CORRECTO"),finalizar=false):console.log("INCORRECTO");
    } while (finalizar);
