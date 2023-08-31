/*5 Crea una funcion que deteremine si una palabra es un palindromo (se lee igual de izquierda a derecha que de 
    decha a izquierda) */
palindromo();
function palindromo() {
    var palabra = prompt('Ingresa un plabra');
    var palabraAlreves = palabra.split('').reverse('').join('');
    (palabra === palabraAlreves)?alert(`La palabra ${palabra} es palindromo`):alert(`La palabra ${palabra} no es palindromo`);
}