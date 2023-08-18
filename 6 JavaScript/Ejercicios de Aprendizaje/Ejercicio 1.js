import prompt from 'prompt';
/*Escribir un algoritmo en   el cual se consulte al usuario que ingrese ¿cómo está el día de
hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que
indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario. */
var terminar = true;
do{
    var estadoDia = prompt("¿Cómo está el día de hoy? (soleado, nublado, lloviendo)").toLowerCase();
    (estadoDia === 'soleado')? (console.log("El día de hoy está SOLEADO."),terminar =false):
    (estadoDia === "nublado")? (console.log("El día de hoy está NUBLADO."),terminar =false):
    (estadoDia === "lloviendo")? (console.log("El día de hoy está LLOVIENDO."),terminar =false):
    console.log("No se reconoce el estado ingresado.");

}while(terminar);
