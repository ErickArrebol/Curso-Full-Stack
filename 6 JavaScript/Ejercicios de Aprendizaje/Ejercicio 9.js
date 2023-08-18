/*Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
funcionamiento  de la función Substring().*/

let frase = prompt("Ingresa un frase");
let frasenueva = "";
for (let index = 0; index < frase.length; index++) {
    frasenueva += frase.substring(index,index+1)+ " ";
}
console.log(frasenueva);