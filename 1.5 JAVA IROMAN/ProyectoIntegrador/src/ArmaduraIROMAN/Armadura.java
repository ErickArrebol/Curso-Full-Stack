package ArmaduraIROMAN;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Armadura {

    private String nombre;
    private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia;
    private int nivelSalud;
    private Generador generador;//bateria de la armadura
    private Bota botaIzquierda;
    private Bota botaDerecha;
    private Guante guanteIzquierdo;
    private Guante guanteDerecho;
    private Consola consola;
    private Sintetizador sintetizador;
    private ArrayList<Radar> radar;

    public Armadura(String nombre, String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud) {
        this.nombre = nombre;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.generador = new Generador(100f);
        this.botaIzquierda = new Bota(.1f, "Bota Izquierda");
        this.botaDerecha = new Bota(.1f, "Bota Drecha");
        this.guanteIzquierdo = new Guante(.15f, "Guante Izquierdo");
        this.guanteDerecho = new Guante(.15f, "Guante Derecho");
        this.consola = new Consola(.001f, "Consola");
        this.sintetizador = new Sintetizador(.003f, "Sintetizador");
        this.radar = crearObjetivocs();
    }

    public ArrayList<Radar> getRadar() {
        return radar;
    }

    @Override
    public String toString() {
        return "La " + nombre + " color " + colorPrimario + " & " + colorSecundario + "\nnivel Resistencia " + nivelResistencia + "\nnivel de Salud " + nivelSalud + "\nBateria " + generador.getEnergiaMaxima();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void caminar(double intensidad, double tiempo) {

        if (!botaIzquierda.isDanado() || !botaDerecha.isDanado()) {//si ambas botas funcionan
            double energiaConsumida = botaIzquierda.usar(intensidad, tiempo) + botaDerecha.usar(intensidad, tiempo);
            botaIzquierda.setDanado(botaIzquierda.sufrirDanios());
            botaDerecha.setDanado(botaIzquierda.sufrirDanios());
            informarGenerador(energiaConsumida);
        } else {
            System.out.println("Error  comando invalido");
            System.out.println("Uno o ambos botas estan dañadas");
        }
        //System.out.println("Consumo "+energiaConsumida);  
    }

    public void correr(double intensidad, double tiempo) {

        if (!botaIzquierda.isDanado() || !botaDerecha.isDanado()) {//si ambas botas funcionan
            double energiaConsumida = botaIzquierda.usar(intensidad * 2, tiempo) + botaDerecha.usar(intensidad * 2, tiempo);
            informarGenerador(energiaConsumida);
            botaIzquierda.setDanado(botaIzquierda.sufrirDanios());
            botaDerecha.setDanado(botaIzquierda.sufrirDanios());
        } else {
            System.out.println("Error  comando invalido");
            System.out.println("Uno o ambos botas estan dañadas");
        }
        //System.out.println("Consumo " + energiaConsumida);
    }

    public void propulsarse(double intensidad, double tiempo) {
        double energiaConsumida = botaIzquierda.usar(intensidad * 3, tiempo) + botaDerecha.usar(intensidad * 3, tiempo);
        informarGenerador(energiaConsumida);
        botaIzquierda.setDanado(botaIzquierda.sufrirDanios());
        botaDerecha.setDanado(botaIzquierda.sufrirDanios());
        //System.out.println("Consumo " + energiaConsumida);
    }

    public void volar(double intensidad, double tiempo) {

        if (!(botaIzquierda.isDanado() && botaDerecha.isDanado() && guanteIzquierdo.isDanado() && guanteDerecho.isDanado())) {
            propulsarse(3, 0.7);
            double consumoBota = botaIzquierda.usar(intensidad * 3, tiempo) + botaDerecha.usar(intensidad * 3, tiempo);
            double consumoGuante = guanteIzquierdo.usar(intensidad * 2, tiempo) + guanteDerecho.usar(intensidad * 2, tiempo);
            informarGenerador((consumoBota + consumoGuante));

            botaIzquierda.setDanado(botaIzquierda.sufrirDanios());
            botaDerecha.setDanado(botaIzquierda.sufrirDanios());
            guanteIzquierdo.setDanado(guanteIzquierdo.sufrirDanios());
            guanteDerecho.setDanado(guanteIzquierdo.sufrirDanios());
            //System.out.println("Consumo " + (consumoBota + consumoGuante));            
        } else {
            System.out.println("Error  comando invalido");
            System.out.println("Uno o varios dispositivos estan dañados estan dañadas");
        }

    }

    public void armas(double intensidad, double tiempo) {
        if (!guanteIzquierdo.isDanado() || !guanteDerecho.isDanado()) {//si ambos guantes funcionan
            double energiaConsumida = guanteIzquierdo.usar(intensidad * 3, tiempo) + guanteDerecho.usar(intensidad * 3, tiempo);
            informarGenerador(energiaConsumida);
            guanteIzquierdo.setDanado(guanteIzquierdo.sufrirDanios());
            guanteDerecho.setDanado(guanteIzquierdo.sufrirDanios());

        } else if (!botaIzquierda.isDanado() || botaDerecha.isDanado()) {//si guante izquierda funciona
            double energiaConsumida = guanteIzquierdo.usar(intensidad * 3, tiempo);
            informarGenerador(energiaConsumida);
            guanteIzquierdo.setDanado(guanteIzquierdo.sufrirDanios());

        } else if (botaIzquierda.isDanado() && !botaDerecha.isDanado()) {//si guante deracha funciona
            double energiaConsumida = guanteDerecho.usar(intensidad * 3, tiempo);
            informarGenerador(energiaConsumida);
            guanteDerecho.setDanado(guanteIzquierdo.sufrirDanios());
        }

    }

    public void escribirCosonla() {//
        float energiaConsumida = consola.usar(1);
        informarGenerador(energiaConsumida);
    }

    public void hablarSintetizador() {
        int energiaConsumida = sintetizador.usar(1);
        informarGenerador(energiaConsumida);
    }

    private void informarGenerador(double energiaConsumida) {
        generador.consumirEnergia(energiaConsumida);
    }

    public void mostrarEstadoArmadura() {
        hablarSintetizador();// <---- se pide el petodo a traves de la voz por eso se llama el metodo 
        System.out.println("Estado de la Armadura " + nombre + " " + colorPrimario + " es ");
        System.out.print("Bota izquierda: ");
        botaIzquierda.estado();
        System.out.print("Bota derecha: ");
        botaDerecha.estado();
        System.out.print("Guante izquierdo: ");
        guanteIzquierdo.estado();
        System.out.print("Guante derecho: ");
        guanteDerecho.estado();
        System.out.print("Consola ");
        consola.estado();
        System.out.print("Sintetizador ");
        sintetizador.estado();
        System.out.println("Energia actual: " + generador.getEnergiaMaxima() + "%");
        System.out.println("Resistencia: " + nivelResistencia);
        System.out.println("Nivel de carga: 100");
        System.out.println("Nivel de salud de Tony " + nivelSalud);
        System.out.println("");
    }

    public void mostrarEstadoBateria() {
        hablarSintetizador();// <---- se pide el petodo a traves de la voz por eso se llama el metodo 
        System.out.println("Estado de la Batería: " + generador.getEnergiaMaxima() + "%");
    }

    public void mostrarInfoReactor() {
        hablarSintetizador();// <---- se pide el petodo a traves de la voz por eso se llama el metodo 
        float nivelBateria = 100 / nivelResistencia;
        float nivelPlutonio = nivelBateria * 100;
        float nivelURU = nivelBateria * 500;
        System.out.println("Información del reactor:");
        System.out.println("Nivel de plutonio: " + nivelPlutonio + " kg");
        System.out.println("Nivel de uru: " + nivelURU + " g");
    }

    public void revisarDispositivos() {
        System.out.println("D I A G N O S T I C O    D E   D I S P O S I T I V O S");
        hablarSintetizador();
        revisarDispositivo1x1(botaIzquierda);
        revisarDispositivo1x1(botaDerecha);
        revisarDispositivo1x1(guanteIzquierdo);
        revisarDispositivo1x1(guanteDerecho);
        revisarDispositivo1x1(consola);
        revisarDispositivo1x1(sintetizador);
    }

    private void revisarDispositivo1x1(DispositivosArmadura pieza) {
        if (pieza.danado) {
            System.out.println(pieza.getNombre() + " está dañado.");

        } else {
            System.out.println(pieza.getNombre() + " está funcionando correctamente.");
        }
    }

    public void repararDispositivos() {
        System.out.println("R E S T A U R A C I O N    D E    D I S P O S I T I V O S");
        hablarSintetizador();
        repararDispositivo1X1(botaIzquierda);
        repararDispositivo1X1(botaDerecha);
        repararDispositivo1X1(guanteIzquierdo);
        repararDispositivo1X1(guanteDerecho);
        repararDispositivo1X1(consola);
        repararDispositivo1X1(sintetizador);
    }

    private void repararDispositivo1X1(DispositivosArmadura pieza) {
        if (pieza.danado) {
            System.out.println(pieza.getNombre() + " está dañado.");
            int intentos = 0;
            boolean reparado = false;
            int maximosIntentos = 10;
            do {
                intentos++;
                
                reparado = pieza.repararDanios();
                if (reparado) {
                    intentos = maximosIntentos;
                }
            } while (intentos != maximosIntentos);
            System.out.println(reparado ? pieza.getNombre() + " ha sido reparado." : pieza.getNombre() + " no se pudo reparar y ha sido destruido.");

        }

    }

    private ArrayList<Radar> crearObjetivocs() {
        Random random = new Random();
        int cantidad = random.nextInt(10);
        ArrayList<Radar> enemigos = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            float resistance = random.nextFloat() * 100;
            float x = random.nextFloat() * 1000;
            float y = random.nextFloat() * 1000;
            float z = random.nextFloat() * 1000;
            boolean hostile = random.nextBoolean();
            enemigos.add(new Radar(resistance, x, y, z, hostile));
        }
        if (enemigos.isEmpty()) {
            System.out.println("No se dectecto ningun objetivo dentro del rengo");
        }
        return enemigos;
    }

    public void radarActivado() {
        System.out.println("");
        System.out.println("R A D A R   A C T I V A D O");      
        int conteo = 0;
        for (Radar aux : radar) {
            if (aux.isHostile()) {
                conteo++;
            }
        }
        if(radar.isEmpty()){
            System.out.println("No se encontro ningun objeto");
        }
        if(radar.size()>0){
            System.out.println("Se han detectado " + radar.size() + " Objetivo(s)");
            if(conteo == 0){
                System.out.println("Pero ninguno es Hostil");
            }
        }
        if (conteo==1){
            System.out.println("Alerta  Alerta  Alerta");
            System.out.println(" 1 obejtivo hotil");
        }
        if (conteo>1){
            System.out.println("Alerta  Alerta  Alerta");
            System.out.println(conteo+" obejtivos hotiles");
        }
        if(conteo >0){
            destruirEnemigo();
        }
        
    }

    public void destruirEnemigo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        escribirCosonla();// <---- se ingresa datos manuales por eso se llama el metodo 
        System.out.println("");
        System.out.println("A C T I V A N D O   S I S T E M A S   D E   D E F E N S A");
        int i = 0;
        double intensidad = 2;
        double timepo = 1;
        
        for (int j = 0; j < radar.size(); j++) {
            if (generador.getEnergiaMaxima() >= 10) {
                float distancia = radar.get(j).calcularDistancia(radar.get(j), 0, 0, 0);

                if (radar.get(j).isHostile() && distancia <= 5000 && generador.getEnergiaMaxima() > 9) {
                    System.out.println("Objetivo (" + (i + 1) + ")" + radar.get(j).toString());
                    System.out.println("Se encuentra el enemigo a " + distancia + " de Distancia");
                    if (guanteIzquierdo.isDanado() && guanteDerecho.isDanado()) {
                        System.out.println("No se puede disparar porque Ambos guantes están dañados.");
                        
                        break;
                    }
                    if (!guanteIzquierdo.isDanado() && !guanteDerecho.isDanado()) {
                        while (radar.get(j).getResistance() > 0 && generador.getEnergiaMaxima() > 9) {
                            float potencia = 5000 / distancia;
                            radar.get(j).setResistance(radar.get(j).decrementarResistencia(radar.get(j).getResistance(), potencia));
                            armas(intensidad, timepo);
                        }
                    } else if (!guanteIzquierdo.isDanado()) {
                        while (radar.get(j).getResistance() > 0 && generador.getEnergiaMaxima() > 9) {
                            float potencia = 5000 / distancia;
                            radar.get(j).setResistance(radar.get(j).decrementarResistencia(radar.get(j).getResistance(), potencia));
                            armas(intensidad, timepo);
                        }
                    } else if (!guanteDerecho.isDanado()) {
                        while (radar.get(j).getResistance() > 0 && generador.getEnergiaMaxima() > 9) {
                            float potencia = 5000 / distancia;
                            radar.get(j).setResistance(radar.get(j).decrementarResistencia(radar.get(j).getResistance(), potencia));
                            armas(intensidad, timepo);
                        }
                    }
                    if (generador.getEnergiaMaxima() < 10) {
                        System.out.println("No se puedo destruir al enemigo " + radar.get(j).getResistance() + " de Resistencia");
                        accionesEvasivas();
                        break;
                    }
                    if (radar.get(j).getResistance() <= 0) {
                        radar.remove(j);
                        System.out.println("Enemigo destruido.");
                    }
                    i++;
                }
            } else {
                accionesEvasivas();
            }

        }
    }

    public void accionesEvasivas() {
        System.out.println("");
        System.out.println("A C T I V A N D O    A C C I O N    E V A S I V A");
        double tiempoAlejarse = 10000 / 300; // Distancia (10 km) dividida por velocidad (300 km/h)
        System.out.println("Nivel de batería inferior al 10%. Alejándose del enemigo por al menos 10 km.");
        System.out.println("Tiempo estimado para alejarse: " + tiempoAlejarse + " horas.");
        volar(3, (int) tiempoAlejarse);
        
    }

}
