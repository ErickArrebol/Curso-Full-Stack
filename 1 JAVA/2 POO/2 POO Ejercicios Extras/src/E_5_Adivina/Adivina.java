package E_5_Adivina;


public class Adivina {
    private String MESES []={"enero", "febrero", "marzo", "abril", 
                            "mayo", "junio", "Julio","agosto", 
                            "septiembre", "octubre", "noviembre", "diciembre"};;
    private String MEsSECRETO= MESES[9];

    public Adivina() {
    }
    public String[] getMESES() {
        return MESES;
    }
    public String getMEsSECRETO() {
        return MEsSECRETO;
    }
    public void setMESES(String[] MESES) {
        this.MESES = MESES;
    }
    public void setMEsSECRETO(String MEsSECRETO) {
        this.MEsSECRETO = MEsSECRETO;
    }
    @Override
    public String toString() {
        return "Adivina{" + "MESES=" + MESES + ", MEsSECRETO=" + MEsSECRETO + '}';
    }
    
    
}
