package E_6_SopaDeLetras;

public class SopaDeLetras {
    
private char[][] matriz;
    private String palabra;

    public SopaDeLetras() {
        matriz = new char[10][10];
        palabra = "";
        matriz[0] = "gatosperro".toCharArray();
        matriz[1] = "lucesfocos".toCharArray();
        matriz[2] = "casasmesas".toCharArray();
        matriz[3] = "autospatos".toCharArray();
        matriz[4] = "metropapas".toCharArray();
        matriz[5] = "lagospelos".toCharArray();
        matriz[6] = "nievefresa".toCharArray();
        matriz[7] = "aguassales".toCharArray();
        matriz[8] = "playaarbol".toCharArray();
        matriz[9] = "nubescielo".toCharArray();
        // Inicializar matriz con palabras preestablecidas
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
