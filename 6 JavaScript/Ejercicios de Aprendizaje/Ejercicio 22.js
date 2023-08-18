/*Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a
elección. */

const boton = document.getElementById('Boton');
const mensaje1 = document.getElementById('mensaje1');
const mensaje2 = document.getElementById('mensaje2');


boton.addEventListener('click',() =>{
    console.log("Locura es hacer lo mismo una y otra vez y esperar resultados diferente\nby Albert Einstein"); 
    mensaje1.textContent ='Locura es hacer lo mismo una y otra vez y esperar resultados diferente';
    mensaje2.textContent = 'by Albert Einstein'
});

