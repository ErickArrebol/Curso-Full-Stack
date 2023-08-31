
const boton = document.getElementById('cookie');
boton.addEventListener('click', crearCookie)
function crearCookie(e) {
    if (!e) {
        e = window.event;
    }
    if (e.target.id == 'cookie') {
        document.cookie = 'nombre = 111Erick';
    }
}