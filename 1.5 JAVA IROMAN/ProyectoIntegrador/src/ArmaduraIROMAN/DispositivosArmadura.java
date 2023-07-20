package ArmaduraIROMAN;

import java.util.Random;

public class DispositivosArmadura {
    
    protected float consumoEnergia;
    boolean danado;
    String nombre;
    
    protected DispositivosArmadura( float consumoEnergia, String nombre) {
        this.consumoEnergia = consumoEnergia;
        this.danado = false;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getConsumoEnergia() {
        return consumoEnergia;
    }
    
    public boolean isDanado() {
        return danado;
    }

    public void setDanado(boolean danado) {
        this.danado = danado;
    }

    public boolean sufrirDanios() {
        Random random = new Random();
        if (random.nextInt(10)+1 < 3) {
            danado=true;
        }
        return danado;   
    }

    public boolean repararDanios() {
        Random random = new Random();
        if (random.nextInt(100)+1 < 40) {
            danado=false;
        }
        return danado;
    }
    
    
    
}
