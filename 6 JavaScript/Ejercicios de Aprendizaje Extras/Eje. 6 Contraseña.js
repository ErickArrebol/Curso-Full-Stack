/*6 Crea una funcion que genere una contraseña aleatoria con letras, numeros y caracteres especiales */
// contraseña();
function contraseña() {
    var passwork='';
    for (let index = 0; index <20; index++) {
        let posicion = Math.floor(Math.random()*(126 - 33 + 1) + 33);
        passwork += String.fromCharCode(posicion);
        
    }
    console.log(passwork)
}