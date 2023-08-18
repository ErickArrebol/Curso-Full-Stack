/*Resalte todas  las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
amarillo, por ejemplo) */

const parrafo = document.getElementById('parrafo'); // Obtener el elemento del párrafo por su id

const palabras = parrafo.textContent.split(' '); // Dividir el contenido del párrafo en palabras

const palabrasLargas = palabras.filter(palabra => palabra.length > 8); // Filtrar palabras con más de 8 caracteres

const contenidoResaltado = palabras.map(palabra => { // Resaltar las palabras largas con un fondo amarillo
    if (palabrasLargas.includes(palabra)) {
        return `<span class="resaltado">${palabra}</span>`;
    }
    return palabra;
}).join(' ');

parrafo.innerHTML = contenidoResaltado; // Aplicar el contenido resaltado al párrafo
