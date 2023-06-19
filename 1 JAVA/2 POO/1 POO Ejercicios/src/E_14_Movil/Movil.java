package E_14_Movil;

public class Movil {
    
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private String[] codigo;
    public int[] vector;

    public Movil() {
    }
    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, String[] codigo, int[] vector) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
        this.vector = vector;
    }
    public String getMarca() {
        return marca;
    }
    public double getPrecio() {
        return precio;
    }
    public String getModelo() {
        return modelo;
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public int getAlmacenamiento() {
        return almacenamiento;
    }
    public String[] getCodigo() {
        return codigo;
    }
    public int[] getVector() {
        return vector;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }
    public void setVector(int[] vector) {
        this.vector = vector;
    }
    
    
}
