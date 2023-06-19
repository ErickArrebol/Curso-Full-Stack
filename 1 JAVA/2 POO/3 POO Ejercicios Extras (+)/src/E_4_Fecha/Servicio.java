package E_4_Fecha;

public class Servicio {

    public void verificarAnio(Fecha fecha) {
        if (fecha.getAnio() < 1900 || fecha.getAnio() > 2021) {
            fecha.setAnio(1900); // Establecer el valor por defecto
        }
    }

    public static int obtenerDiasMes(Fecha fecha) {
        int diasMes = 0;
        switch (fecha.getMes()) {
            case 1: // Enero
                diasMes = 31;
                break;
            case 2: // Febrero
                if (esAnioBisiesto(fecha.getAnio())) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
            case 4: // Abril
                diasMes = 30;
                break;
            case 3: // Marzo
                diasMes = 31;
                break;
            case 5: // Mayo
                diasMes = 31;
                break;
            case 6: // Junio
                diasMes = 30;
                break;
            case 7: // Julio
                diasMes = 31;
                break;
            case 8: // Agosto
                diasMes = 31;
                break;
            case 9: // Septiembre
                diasMes = 30;
                break;
            case 10: // Octubre
                diasMes = 31;
                break;
            case 11: // Noviembre
                diasMes = 30;
                break;
            case 12: // Diciembre
                diasMes = 31;
                break;
        }
        return diasMes;
    }

    public void mostrarDiaAnterior(Fecha fecha) {
        if (fecha.getDia() > 1) {
            fecha.setDia(fecha.getDia() - 1);
        } else {
            if (fecha.getMes() > 1) {
                fecha.setMes(fecha.getMes() - 1);
                fecha.setDia(obtenerDiasMes(fecha));
            } else {
                fecha.setAnio(fecha.getAnio() - 1);
                fecha.setMes(12);
                fecha.setDia(obtenerDiasMes(fecha));
            }
        }
    }

    public void mostrarDiaPosterior(Fecha fecha) {
        int diasMes = obtenerDiasMes(fecha);

        if (fecha.getDia() < diasMes) {
            fecha.setDia(fecha.getDia() + 1);
        } else {
            if (fecha.getMes() < 12) {
                fecha.setMes(fecha.getMes() + 1);
                fecha.setDia(1);
            } else {
                fecha.setAnio(fecha.getAnio() + 1);
                fecha.setMes(1);
                fecha.setDia(1);
            }
        }
    }

    public static boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0);
    }
}
