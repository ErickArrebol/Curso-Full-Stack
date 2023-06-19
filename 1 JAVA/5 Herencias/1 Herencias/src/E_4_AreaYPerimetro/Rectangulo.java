/*Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.*/
package E_4_AreaYPerimetro;

/*@author Erick*/
public class Rectangulo implements carculosFormas {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area() {
        double area  = base* altura;
        System.out.println("La area del Rectangulo es "+area);
    }

    @Override
    public void perimetro() {
        double perimetro = (base+altura)/2;
        System.out.println("El perimetro del Rectangulo es "+ perimetro);
    }
    
}
