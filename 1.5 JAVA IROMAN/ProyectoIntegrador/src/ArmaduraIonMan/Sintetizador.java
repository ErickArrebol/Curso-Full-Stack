package ArmaduraIonMan;

public class Sintetizador extends DispositivosArmadura{

    public Sintetizador(float consumoEnergia, String nombre) {
        super(consumoEnergia, nombre);
    }

    public int usar(int intensidad) {
        return (int) (this.getConsumoEnergia() * intensidad );
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
