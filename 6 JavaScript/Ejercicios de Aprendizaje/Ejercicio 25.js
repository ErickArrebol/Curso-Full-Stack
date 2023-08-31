/*Escriba una función  de JavaScript para obtener los valores de Nombre y Apellido del
siguiente formulario.*/
getFormValores();


function getFormValores() {
    const formulario = document.getElementsByTagName('input');
    let persona = {};
    formulario[4].addEventListener('click', () => {
        persona.nombre =formulario[0].value;
        persona.apellido = formulario[1].value;
        persona.sexo = formulario[2].value;
        persona.nacionalidad =formulario[3].value;
        if (persona.nombre === '' || persona.apellido === '' | persona.sexo === '' || persona.nacionalidad === '') {
            alert('Llena todos lo comapos')
        }else {
            console.log('Datos');
            console.log(persona);
            alert('Se ha enviado correctamente')
        }  
    });
    
};




