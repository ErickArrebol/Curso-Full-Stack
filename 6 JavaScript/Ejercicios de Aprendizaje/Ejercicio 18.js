/*A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando  exclusivamente los dos valores booleanos del array, determinar los
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
dos elementos numéricos */

let valores = [true, 5, false, "hola", "adios", 2];
incisoA();
incisoB();
incisoC();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function incisoA(){
    let contador = 0;
    let cadena1="";
    let cadena2="";

    valores.forEach(function(elemento) {
        (typeof elemento == 'string') ? ((contador === 0) ? cadena1 = elemento : cadena2 = elemento, contador++): null;
    });

    (cadena1.length > cadena2.length)?console.log("El elemento 'hola' es mayor a 'adios'"):
    (cadena2.length > cadena1.length)?console.log("El elemento 'adios' es mayor a 'hola'"):
    console.log("Ambos elemento son iguales");
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function incisoB(){
    let contador = 0;
    let logica1;
    let logica2;
    valores.forEach(function(elemento) {
        (typeof elemento == 'boolean')? ((contador ===0)? logica1 = elemento: logica2 = elemento,contador++): null;
    });
    (logica1)?console.log('Es buena la Guia de JavaScript'): null;
    (!logica2)? console.log('La guia de HTML y CSS apesta'): null
   
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function incisoC(){
    let contador = 0;
    let numero1 = 0;
    let numero2 = 0;
    valores.forEach(function(elemento) {
        (typeof elemento == 'number')?((contador === 0)? numero1 = elemento:numero2 = elemento,contador++ ):null;
    });
    console.log(`La Suma de ${numero1} y ${numero2} es: ${numero1 + numero2 }`)
    console.log(`La Resta de ${numero1} y ${numero2} es: ${numero1 - numero2 }`)
    console.log(`La Multiplicacion de ${numero1} y ${numero2} es: ${numero1 *numero2 }`)
    console.log(`La Division de ${numero1} y ${numero2} es: ${numero1 / numero2 }`)
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

