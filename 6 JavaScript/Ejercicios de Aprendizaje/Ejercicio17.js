/*Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el
resultado */

let array = ['Perro','Gato','Caballo','Burro','Vaca','Gallinas'];
delete array[3];// Elimina l elemneto en la psosicion sin borra el indice del array
delete array[5];
console.log(array);

let array2 = ['Perro', 'Gato', 'Caballo', 'Burro', 'Vaca', 'Gallinas'];
array2.splice(1,2);// Eliminando apartir de la posicion (1) la cantidad (2) de elementos
console.log(array);