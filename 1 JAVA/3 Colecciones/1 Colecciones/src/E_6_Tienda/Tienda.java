package E_6_Tienda;

import java.util.Map;

public class Tienda {
    
    private Map<String, Double> productos ;

    public Tienda() {
    }
    public Tienda(Map<String, Double> productos) {
        this.productos = productos;
    }
    public Map<String, Double> getProductos() {
        return productos;
    }
    public void setProductos(Map<String, Double> productos) {
        this.productos = productos;
    }
    
}
