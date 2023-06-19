package E_2_CantanteFamoso;

public class CantanteFamoso {
    
    private String nombre;
    private String discoMasVentas;

    public CantanteFamoso(String nombre, String discoMasVentas) {
        this.nombre = nombre;
        this.discoMasVentas = discoMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscoConMasVentas() {
        return discoMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoMasVentas = discoConMasVentas;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + ", Disco Mas Ventas " + discoMasVentas ;
    }
    
    
}
