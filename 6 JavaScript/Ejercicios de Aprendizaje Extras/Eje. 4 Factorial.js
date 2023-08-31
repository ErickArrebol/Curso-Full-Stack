/*4 Desarrolla una funcion que calcula el factorial de numero dado */
factorial();
function factorial(){
    let salida = true;
    do {
         var n1 =parseInt(prompt('Ingresa 1 numero'));
        (Number.isNaN(n1))?alert('ERROR Ingresa solo numeros'):salida = false;
    } while (salida);
    var suma=1;
    for (let index = n1; index > 0; index --) {
        suma = suma*index;
        console.log(suma);   
    }
    alert(`El factorial de ${n1} es : ${suma}`);
}