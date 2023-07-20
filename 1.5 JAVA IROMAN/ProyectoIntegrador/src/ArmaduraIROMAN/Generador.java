package ArmaduraIROMAN;

public class Generador {
    
    private float energiaMaxima;

    public Generador(float energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    public float getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void consumirEnergia(double energiaConsumida) {
        energiaMaxima -= energiaConsumida;
    }

    @Override
    public String toString() {
        return "Generador{" + "energiaMaxima=" + energiaMaxima + '}';
    }
    
       
}
