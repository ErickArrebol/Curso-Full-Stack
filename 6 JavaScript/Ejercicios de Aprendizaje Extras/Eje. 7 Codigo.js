/*7 Crea una aplicacion de lista de tareas (To-Do list) que permita agregar, editar y eliminar tareas. utilizando 
objetos y DOM manipulation*/
// Lista de tareas
const arregloTareas = [];//se inicializa como un arreglo vacío
console.log('dimension del arreglo '+arregloTareas.length)
console.log(arregloTareas)
// Referencias a elementos DOM
const tarea = document.getElementById('tarea');
const botonAgregar = document.getElementById('botonAgregar');
const lista = document.getElementById('listaDeTareas');

// Función para agregar una tarea
function agregarTarea() {
    const textoDeLaTarea = tarea.value.trim();//lo limpia de espacios en blanco al principio y al final con el trim()
    (textoDeLaTarea !== '')? //si textoDeLaTarea es distinto a vacion
    (arregloTareas.push({ texto: textoDeLaTarea, editado: false }),//inicializo el arreaglo con dos propiedades
    actualizarListaDeTareas(),//llamamos ala funcion actualizar
    tarea.value = '')://el input de nueva tarea  lo ponemos vacio
    null//si no se cumple la condicion de arriba no se realiza ninguna accion
}

// Función para editar una tarea
function editarTarea(i) {
    arregloTareas[i].editado = true;
    actualizarListaDeTareas();
}

// Función para guardar cambios en una tarea editada
function guardarTarea(i, nuevaTarea) {
    arregloTareas[i].texto = nuevaTarea;
    arregloTareas[i].editado = false;
    actualizarListaDeTareas();
}

// Función para eliminar una tarea
function eliminarTarea(i) {
    arregloTareas.splice(i, 1);
    actualizarListaDeTareas();
}

// Función para actualizar la lista de tareas en el DOM
function actualizarListaDeTareas() {
    lista.innerHTML = '';
    arregloTareas.forEach((tarea, i) => {
        const li = document.createElement('li');
        if (tarea.editado) {
            li.innerHTML = `
                <input type="text" value="${tarea.texto}" id="editarInput">
                <button class="guardar" data-indice="${i}"><span>Guardar</span></button>
            `;
        } else {
            li.innerHTML = `
            <span class="texto">${tarea.texto}</span>
            <span class="acciones">
                <span class="editar" data-indice="${i}">Editar</span>
                <span class="eliminar" data-indice="${i}">Eliminar</span></button>
            </span>
            `;
        }
        lista.appendChild(li);
    });
}

// Delegación de eventos para los botones de editar y eliminar tareas
lista.addEventListener('click', (evento) => {
    const indice = evento.target.getAttribute('data-indice');
    if (evento.target.classList.contains('eliminar')) {
        eliminarTarea(indice);
    } else if (evento.target.classList.contains('editar')) {
        editarTarea(indice);
    } else if (evento.target.classList.contains('guardar')) {
        const li = evento.target.closest('li'); // Buscar el elemento li padre
        const nuevaTarea = li.querySelector('input').value;
        guardarTarea(indice, nuevaTarea);
    }
});

// Agregar evento al botón de agregar tarea
botonAgregar.addEventListener('click', agregarTarea);

// Inicializar la lista de tareas
actualizarListaDeTareas();
console.log('dimension del arreglo '+arregloTareas.length)
console.log(arregloTareas)
