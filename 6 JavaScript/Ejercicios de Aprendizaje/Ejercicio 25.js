/*Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
siguiente formulario.*/
function getFormValores() {
    
const formulario = document.getElementsByTagName('input');
console.log('Datos'+'\nNombre: '+(formulario[0].value)+ '\nApellido: '+(formulario[1].value));
alert('Se ha enviado correctamente')
};



