/*Escribir  una función flecha de JavaScript que reciba un argumento y retorne el tipo de
dato. */

let dato = parseInt(prompt('Ingresa un dato'));
func(dato);
const func =(dato)=>{
    (Number.isNaN(dato))?alert(`El dato ${dato} es de tipo String`):
    (!Number.isNaN(dato))?alert(`El dato ${dato} es de tipo number`):null;
}
