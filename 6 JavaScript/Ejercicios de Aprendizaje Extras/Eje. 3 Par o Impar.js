/*3 Escribe un programa que verifique si un numero  ingresado por el usuario se par o impar*/
let salida = true;
do {
    alert('INGRESA 1 NUMEROS')
    let n1 =parseInt(prompt('Numero 1'));
    (Number.isNaN(n1) )?alert('Ingresa solo numeros'):
    (n1%2 === 0)? (alert('El numero es PAR'),salida = false):
    (n2 % 2 != 0)? (alert('El numero es Impar'),salida = false):(alert('El numero es 0 asi que no es Par o Impar'),salida = false);
} while (salida);