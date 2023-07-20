package E_1_Perro;

import java.util.ArrayList;
import java.util.List;

public class Perros {
    
    private  List<String> nombreMascota;

    public Perros() {
    }
    public Perros(List<String> nombreMascota) {
        this.nombreMascota = new ArrayList();
    }
    public List<String> getNombreMascota() {
        return nombreMascota;
    }
    public void setNombreMascota(List<String> nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    //////////////////////////////////////////////////////////////
}
