package ArmaduraIROMAN;

public class Bota extends DispositivosArmadura{

    public Bota(float consumoEnergia, String nombre) {
        super(consumoEnergia, nombre);
    }

    public boolean isDanado() {
        return danado;
    }

    public void setDanado(boolean danado) {
        this.danado = danado;
    }

    
    public double usar(double intensidad, double tiempo) {
        return  (this.getConsumoEnergia() * intensidad * tiempo);
    }

   public void estado() {
        System.out.println(this.isDanado() ? "Dañado" : "Funcionado");//terranario
    }
}
