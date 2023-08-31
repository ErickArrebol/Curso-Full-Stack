//Crea una galeria de imagnes que permita filtrar las imagenes  por categorias (por ejemplo Paisajes animasles y comida)
const animales = [];
animales.push({imagen:'Animales/caballo.jpg',descripcion:'Animal Caballo'});
animales.push({imagen:'Animales/panda.jpg',descripcion:'Animal Panda'});
animales.push({imagen:'Animales/gato.jpg',descripcion:'Animal Gato'});
animales.push({imagen:'Animales/Lobo.jpg',descripcion:'Animal Lobo'});
animales.push({imagen:'Animales/leon.jpg',descripcion:'Animal Leon'});
animales.push({imagen:'Animales/pitbul.jpg',descripcion:'Animal Pitbull'});
animales.push({imagen:'Animales/mariposa.jpg',descripcion:'Animal Mariposa'});
animales.push({imagen:'Animales/ajolotes2.jpg',descripcion:'Animal Ajolote'});
animales.push({imagen:'Animales/zorro.jpg',descripcion:'Animal Zorro'});
const paisajes = [];
paisajes.push({imagen:'Paisajes/Piramide.jpg' , descripcion:'Paisajes Piramide de chicheniza'})
paisajes.push({imagen:'Paisajes/cenotes de yucatan.jpg' , descripcion:'Paisajes Cenotes'})
paisajes.push({imagen:'Paisajes/Monumento.jpg"' , descripcion:'Paisajes Monumento'})
paisajes.push({imagen:'Paisajes/Mar vista.jpg' , descripcion:'Paisajes Vista de mar'})
paisajes.push({imagen:'Paisajes/Rodada-CDMX.jpg' , descripcion:'Paisajes el angel de la independencia'})
paisajes.push({imagen:'Paisajes/Hierve el agua en oaxaca.jpg' , descripcion:'Paisajes Hierve el agua'})
paisajes.push({imagen:'Paisajes/Mar.jpg' , descripcion:'Paisajes Mar'})
paisajes.push({imagen:'Paisajes/7.-Cascadas-de-Agua-Azul-Chiapas.jpg' , descripcion:'Paisajes Cascadas de agua azul'})
paisajes.push({imagen:'Paisajes/Piramide 3.jpg' , descripcion:'Paisajes Piramide'})
const comidas = [];
comidas.push({imagen:'Comida/Alambre.jpg' , descripcion:'Comida Alambre'})
comidas.push({imagen:'Comida/Sopes.jpg' , descripcion:'Comida Sopes'})
comidas.push({imagen:'Comida/pozole-mexicano.jpg' , descripcion:'Comida pozole'})
comidas.push({imagen:'Comida/Mole.jpg' , descripcion:'Comida Mole'})
comidas.push({imagen:'Comida/Chile relleno.jpg' , descripcion:'Comida Chile Relleno'})
comidas.push({imagen:'Comida/Enchiladas.jpg' , descripcion:'Comida Enchiladas'})
comidas.push({imagen:'Comida/Quesadillas.jpg' , descripcion:'Comida Quesadillas'})
comidas.push({imagen:'Comida/Tamales.jpg' , descripcion:'Comida Tamales'})
comidas.push({imagen:'Comida/tacos.jpg' , descripcion:'Comida Tacos'})

const paisaje = document.getElementById('uno');
const animal = document.getElementById('dos');
const comida = document.getElementById('tres')
const imagenes = document.getElementById('imagen');

paisaje.addEventListener('click', () => {
    imagenes.innerHTML = '';
    paisajes.forEach((elemento, i) => {
        const codigoPaisajes = `
        <img class="imagen" src="${elemento.imagen}" alt="${elemento.descripcion}" width="91%" data-indice="${i}">
        `;
        imagenes.insertAdjacentHTML('beforeend', codigoPaisajes);
    });
});

animal.addEventListener('click', () =>{
    imagenes.innerHTML = '';
    animales.forEach((elemento,i) =>{
        const codigoAniamles =`
        <img class="imagen" src="${elemento.imagen}" alt="${elemento.descripcion}" width="91%" data-indice="${i}">
        `;
        imagenes.insertAdjacentHTML('beforeend', codigoAniamles);
    })
})

comida.addEventListener('click', () =>{
    imagenes.innerHTML = '';
    comidas.forEach((elemento,i) =>{
        const coidgoComidas =`
        <img class="imagen" src="${elemento.imagen}" alt="${elemento.descripcion}" width="91%" data-indice="${i}">
        `;
        imagenes.insertAdjacentHTML('beforeend', coidgoComidas);
    })
})