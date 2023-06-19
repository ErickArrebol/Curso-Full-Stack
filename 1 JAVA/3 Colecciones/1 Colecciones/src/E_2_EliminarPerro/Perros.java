package E_2_EliminarPerro;

import java.util.List;

public class Perros {
    
    private  List<String> nombreMascota;

    public Perros() {
    }
    public Perros(List<String> nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public List<String> getNombreMascota() {
        return nombreMascota;
    }
    public void setNombreMascota(List<String> nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
}
