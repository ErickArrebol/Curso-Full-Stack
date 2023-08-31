
const botonCrear = document.getElementById('crearCookie');
const botonObtener = document.getElementById('obtenerCookie');

botonCrear.addEventListener('click', crearCookie);
botonObtener.addEventListener('click', obtnerCookie);

function crearCookie(e) {
    if (!e) {
        e = window.event;
    }
    if (e.target.id == 'crearCookie') {
        const fechaExpiracion = new Date();
        fechaExpiracion.setTime(fechaExpiracion.getTime() + (1 * 60 * 1000));
        const nombre = 'erick123';
        console.log(`nombre=${nombre}; espires=${fechaExpiracion.toUTCString()}`);
        document.cookie = `nombre=${nombre}; espires=${fechaExpiracion.toUTCString()}`;
    }
}

function obtnerCookie() {
    const cookies = document.cookie.split('; ');
    console.log(cookies)
    for (const cookie of cookies) {
        const [nombre, valor] = cookie.split('=');
        if (valor == 'erick12') {
            console.log('Se encontro el cookie' + cookie)
            return valor;
        }
    }
    return null; // Si no se encuentra la cookie
}