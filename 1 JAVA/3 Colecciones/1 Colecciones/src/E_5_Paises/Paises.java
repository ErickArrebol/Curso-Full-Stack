package E_5_Paises;

import java.util.Set;

public class Paises {
    
    private Set<String> pais;
    private String paises;

    public Paises() {
    }
    public Paises(Set<String> pais, String paises) {
        this.pais = pais;
        this.paises = paises;
    }

    public Set<String> getPais() {
        return pais;
    }
    public String getPaises() {
        return paises;
    }

    public void setPais(Set<String> pais) {
        this.pais = pais;
    }
    public void setPaises(String paises) {
        this.paises = paises;
    }
}
