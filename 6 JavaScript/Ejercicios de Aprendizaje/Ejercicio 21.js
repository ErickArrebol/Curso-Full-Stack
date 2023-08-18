/*Escribir  un programa para obtener un array de las propiedades de un objeto Persona.
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. */
let persona ={
    nombre: 'Erick',
    edad: 14,
    sexo: 'H',
    peso: 85,
    altura: 1.82
}

let propiedades = [];//opcion 1
for (let propiedad in  persona) {
    propiedades.push(propiedad);
}
console.log(propiedades);

let arrayPropiedades = Object.keys(persona);//opcion 2
console.log(arrayPropiedades);