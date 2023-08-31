//crea un juego en el que el usuario debe de adivinar un numero aleatorio generado por la computadora en un rago especifico

const numeroAleatorio = Math.floor(Math.random()*101);
var contador = 0;
console.log(numeroAleatorio)

const pregunta = document.getElementById('pregunta');
const numeroIngresado = document.getElementById('numero');
const boton = document.getElementById('boton');
const respuesta = document.getElementById('respuesta');
const acierto = document.getElementById('acertaste');

boton.addEventListener('click', ()=>{
    const numero = parseInt(numeroIngresado.value);

    if (!isNaN(numero)) {
        
        if (numero === numeroAleatorio){
            numeroIngresado.value='';
            pregunta.remove();
            numeroIngresado.remove();
            respuesta.remove();
            boton.remove()
            
            contador = 1;
            acierto.textContent = `Felicidades has adivinado`;

        }else{
            numeroIngresado.value='';
            respuesta.textContent = `Sigue intentado`;
        } 
    }
})

