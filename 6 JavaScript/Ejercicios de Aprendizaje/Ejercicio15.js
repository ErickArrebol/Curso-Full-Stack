/*Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
radio del círculo lo proporcionará el usuario. */

const circulo = {
    radio: "",
    cargarDatos: function () {
        this.radio = prompt("Ingresa el radio del círculo");
    }
}

function area(circulo) {
    alert(Math.PI * (circulo.radio * circulo.radio));
}

function perimetro(circulo) {
    alert(2 * Math.PI * circulo.radio);
}

circulo.cargarDatos();
area(circulo);
perimetro(circulo);






