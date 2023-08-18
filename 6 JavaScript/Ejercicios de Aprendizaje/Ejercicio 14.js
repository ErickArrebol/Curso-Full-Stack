/*Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar  mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */

alert("Ingresa los siguientes datos");
const libro = {
    ISBN: "",
    título: "",
    autor: "",
    numPaginas: 0,
cargarLibro: function() {
    ISBN = prompt("Introduce el ISBN del libro:");
    título = prompt("Introduce el título del libro:");
    autor = prompt("Introduce el autor del libro:");
    numPaginas = parseInt(prompt("Introduce el número de páginas del libro:"));
},
informarLibro: function() {
alert(`LIBRO
ISBN: ${ISBN}
Título: ${título}
Autor:  ${autor}
Número de páginas: ${numPaginas}`);
}
};

libro.cargarLibro();
libro.informarLibro();