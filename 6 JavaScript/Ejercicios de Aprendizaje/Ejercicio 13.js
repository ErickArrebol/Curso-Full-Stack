/*Crear un objeto persona,  con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer,
'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript. */
let p1 = new Persona();

function Persona(nombre, edad, sexo, peso, altura) {
    this.Nombre = nombre;
    this.Edad = edad;
    this.Sexo = sexo;
    this.Peso = peso;
    this.Altura = altura;
}

p1.Nombre = prompt("Ingrese su nombre");
p1.Edad = parseInt(prompt("Ingresa tu edad"));
p1.Sexo = prompt(`Ingresa tu sexo H = Hombre || M = Mujer || O = Otro`);
p1.Peso = parseInt(prompt("Ingresa tu peso"));
p1.Altura = parseFloat(prompt("Ingresa tu altura:"));

Object.keys(p1).forEach(function(prop) {
    document.write(prop + ": " + p1[prop] + "<br>"); 
});