/*2 Crea un programa que calcule el promedio de 3 numeros ingresados por el usuario */
let salida = true;
do {
    alert('INGRESA 3 NUMEROS')
    let n1 =parseInt(prompt('Numero 1'));
    let n2 =parseInt(prompt('Numero 2'));
    let n3 =parseInt(prompt('Numero 2'));
    (Number.isNaN(n1) || Number.isNaN(n2) || Number.isNaN(n3))?alert('Ingresa solo numeros'):(alert(`El promedio de los 3 numero ingresados es ${((n1+n2+n3)/3)}`),salida = false)
} while (salida);