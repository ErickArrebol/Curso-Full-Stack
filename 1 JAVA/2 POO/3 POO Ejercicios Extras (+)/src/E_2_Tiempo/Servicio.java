package E_2_Tiempo;

import java.util.Scanner;

public class Servicio {
    
    public Tiempo imprimirHoraCompleta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Tiempo a = new Tiempo();
        System.out.println("----------------RELOJ----------------");

        System.out.print("Ingresa la hora ");
        a.setHora(leer.nextInt());
        System.out.print("Ingresa los minutos ");
        a.setMinutos(leer.nextInt());
        System.out.print("Ingresa los segundos ");
        a.setSegundos(leer.nextInt());

        relod();
        return a;
    }

    public void validacion12() {
        Tiempo a = new Tiempo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int h = 0;
        do {
            if (a.getHora() >= 0 && a.getHora() < 12) {
                h = 1;
            } else {
                System.out.println("ERROR");
                System.out.print("Ingresa la hora nuevamente");
                a.setHora(leer.nextInt());
            }
        } while (h != 0);
        int m = 0;
        do {
            if (a.getMinutos() >= 0 && a.getMinutos() < 60) {
                m = 1;
            } else {
                System.out.println("ERROR");
                System.out.print("Ingresa los minutos ");
                a.setMinutos(leer.nextInt());
            }
        } while (m != 1);
        int s = 0;
        do {
            if (a.getSegundos() >= 0 && a.getSegundos() < 60) {
                s = 1;
            } else {
                System.out.println("ERROR");
                System.out.print("Ingresa los segundos ");
                a.setSegundos(leer.nextInt());
            }
        } while (s != 1);
    }

    public void relod() {
        Tiempo a = new Tiempo();
        int hora = a.getHora();
        int minutos = a.getMinutos();
        int segundos = a.getSegundos();

        for (hora = hora; hora < 12; hora++) {
            for (minutos = minutos; minutos < 60; minutos++) {
                for (segundos = segundos; segundos < 60; segundos++) {
                    String h = Integer.toString(hora);
                    String m = Integer.toString(minutos);
                    String s = Integer.toString(segundos);

                    System.out.println(hora + ":" + minutos + ":" + segundos);
                    segundo();
                    if (hora < 12 && minutos < 59 && segundos == 59) {
                        minutos++;
                        segundos = 0;
                        System.out.println(hora + ":" + minutos + ":" + "00");
                        segundo2();
                    }
                    if (hora < 12 && minutos == 59 && segundos == 59) {
                        segundos = 0;
                        minutos = 0;
                        hora++;
                        System.out.println(hora + ":" + minutos + ":" + "00");
                        segundo2();

                    }

                }
            }
        }

    }

    private static void segundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

    private static void segundo2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
