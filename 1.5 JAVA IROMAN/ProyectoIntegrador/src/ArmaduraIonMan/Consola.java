package ArmaduraIonMan;

public class Consola extends DispositivosArmadura {

    public Consola(float consumoEnergia, String nombre) {
        super(consumoEnergia, nombre);
    }

    public float usar(int intensidad) {
        return  (this.getConsumoEnergia() * intensidad);
    }

    public void estado() {
        System.out.println(this.danado ? "Dañado" :"Funcionando");
    }
    
//    public void estado() {
//        String estado="";
//        if(this.danado){
//          estado = "Dañado"; 
//        }else{
//            estado = "Funcionando"; 
//        }
//        System.out.println(estado);
//    }
}
