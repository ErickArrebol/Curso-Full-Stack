package ArmaduraIonMan;

public class Servicio {

    public String nombreArmadura(){
        String[] nombres = {"Mark I", "Mark II", "Mark III", "Mark IV", "Mark V", "Mark VI",
            "Mark VII", "Mark XLII", "Mark XLIII", "Mark XLIV"};
        return nombres[(int) (Math.random() * nombres.length)];
    }
    
    public String colores(){
        String[] color = {"Rojo", "Azul", "Amarillo", "Negro", "Gris", "Plateado", "Dolaro"};
        return color[(int) (Math.random() * color.length)];
    }
    public int salud(){
        return (30 + (int) (Math.random() * 70+1) );
    }
    public int resitencia(){
        return (70 + (int) (Math.random() * 30) + 1);
    }
            
}
