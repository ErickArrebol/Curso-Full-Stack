/*Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
de una circunferen cia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
para calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio */
let radio = prompt("Ingrese el valor del radio de una circunferencias:");//opcion 1 por el buscador
//let radio = 6;//opcion 2 asignadole valor a la variable
let area = Math.PI*(radio*radio);
console.log("El area del circulo es: "+ area);
let perimetro = 2*Math.PI*radio;
console.log("El perimetro del circulo es: "+ perimetro);