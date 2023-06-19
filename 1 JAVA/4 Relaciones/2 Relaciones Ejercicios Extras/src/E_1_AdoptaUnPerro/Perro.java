
package E_1_AdoptaUnPerro;


import java.util.Random;

/*@author Erick*/
public class Perro {

    private String nombre;
    private String raza;
    private double edad;
    private String tamano;
    private boolean adoptado;
    Random random = new Random();

    public Perro() {
    }

    public Perro(String nombre, String raza, double edad, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.adoptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public double getEdad() {
        return edad;
    }

    public String getTamano() {
        return tamano;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Datos del Perro" + "\nNombre: " + nombre + " Raza: " + raza + "\nEdad: " + edad + " Tamaño: " + tamano;
    }

    public String nombresP() {
        String[] nombresPerros = {
            "Max", "Bella", "Charlie", "Lucy", "Cooper", "Luna", "Rocky", "Daisy",
            "Bailey", "Sadie", "Tucker", "Molly", "Bear", "Maggie", "Duke", "Sophie",
            "Oliver", "Roxy", "Bentley", "Zoe"};
        int posicion = random.nextInt(nombresPerros.length);

        return nombresPerros[posicion];
    }

    public double edadesP() {
        double edades;
        boolean validacion = false;
        do {
            edades = (double) (Math.random() * 18);
            if (edades < 1) {

                double edads = (double) (Math.random() * .10);
                String resultado = Double.toString(edades);
                String digitos3 = "";
                for (int i = 0; i < resultado.length(); i++) {
                    if (i < 3) {
                        digitos3 += resultado.substring(i, i + 1);
                    }
                }

                edades = Double.parseDouble(digitos3);

                validacion = true;
            } else {
                String resultado = Double.toString(edades);
                String digitos3 = "";
                for (int i = 0; i < resultado.length(); i++) {
                    if (i < 1) {
                        digitos3 += resultado.substring(i, i + 1);
                    }
                }
                edades = Double.parseDouble(digitos3);
                validacion = true;
            }
        } while (validacion != true);

        return edades;
    }

    public String medida() {
        String[] medida = {"Pequeña", "Mediana", "Grande"};
        return medida[random.nextInt(medida.length)];
    }

    public String raza() {
        String[] razas = {"Pitbull", "Pitbull", "Bulldog", "Chihuahua", "Dogo", "Dálmata", "Mestizo",
                          "Labrador Retriever", "Golden Retriever", "Rottweiler", "Pastor Alemán",
                          "Bóxer", "Yorkshire Terrier", "Bulldog Francés", "Pomerania", "Caniche",
                           "Husky Siberiano", "Border Collie", "Shih Tzu", "Cocker Spaniel"};
        return razas[random.nextInt(razas.length)];
    }

}
