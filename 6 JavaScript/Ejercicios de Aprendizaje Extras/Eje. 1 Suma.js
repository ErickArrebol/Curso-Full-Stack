/*1 Escribe un programa que sumen 2 numeros como entrada y muestra la suma dde salida*/
let salida = true;
do {
    alert('INGRESA 2 NUMEROS')
    let n1 =parseInt(prompt('Numero 1'));
    let n2 =parseInt(prompt('Numero 2'));
    
    (Number.isNaN(n1) || Number.isNaN(n2))?alert('Escribe solo numeros'):(alert(`La suma de los numeros ${n1+n2}`,salida= false)); 
} while (salida);