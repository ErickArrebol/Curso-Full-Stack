package E_5_Triangulo;

public class Triangulo {
    
    private int base;
    private int lado;

    public Triangulo(int base, int lado) {
        this.base = base;
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Triangulo: base = " + base + ", lado = " + lado;
    }
    
}
