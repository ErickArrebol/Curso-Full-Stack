/* Escribir un programa de JavaScript que a través de un formulario calcule el radio de un
circulo y lo muestre en el HTML.*/
const diametroInput = document.getElementById('diametro');// El numero ingresado
const resultadoLabel = document.getElementById('resultado');
const calcularButton = document.getElementById('calcular');

// Agrega un evento al botón de calcular
calcularButton.addEventListener('click', () => {
    // Obtiene el valor del diámetro ingresado por el usuario
    const diametro = parseInt(diametroInput.value);
    // Muestra el resultado en el elemento de resultado
    resultadoLabel.textContent = `El radio es: ${diametro/2}`;
});




