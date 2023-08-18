/*Construir un programa que simule un menú de opciones para realizar las cuatro
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
numéricos enteros. El usuario, además, debe especificar la operación con el primer
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.*/

do {
    let option = prompt("MENU\nS Suma\nR Resta\nM Multiplicacion\nD Division\nF Fin del programa").toUpperCase();
    switch (option) {
        case "S":
            let numero1 = prompt("Introduce el numero 1");
            let numero2 = prompt("Introduce el numero 2");
            let suma = parseInt(numero1) + parseInt(numero2);
            console.log(`La suma es ${suma}`);
            break;
        case "R":
            numero1 = prompt("Introduce el numero 1");
            numero2 = prompt("Introduce el numero 2");
            console.log(`La resta es ${numero1 - numero2}`);//aca puede realizar la operacion por que es simple pero no es una practica recomendable
            break;
        case "M":
            numero1 = prompt("Introduce el numero 1");
            numero2 = prompt("Introduce el numero 2");
            console.log(`La multiplicacion es ${numero1 * numero2}`);
            break;
        case "D":
            numero1 = prompt("Introduce el numero 1");
            numero2 = prompt("Introduce el numero 2");
            console.log(`La division es ${numero1 / numero2}`);
            break;
        case "F":
            console.log("Fin del proceso");
            break;
        default:
            console.log("Opcion invalida");
            break;
    }
    
} while (option != "F");

