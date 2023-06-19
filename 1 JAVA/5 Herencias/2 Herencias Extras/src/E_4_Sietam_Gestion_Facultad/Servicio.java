/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_4_Sietam_Gestion_Facultad;

/*@author Erick*/
public class Servicio {

    public String crearNombre() {
        String[] nombres = {
            "Erick", "Pedro", "Juan", "Daisy", "Carolina", "Sofia",
            "Diego", "Jorge", "Sebastian", "Ariel", "Eduardo", "Gilberto",
            "Daniel", "Diana", "Julio", "Adriana", "Alejandro", "Carlos",
            "Gabriela", "Fernando", "Ricardo", "Laura", "Luis", "Maria",
            "Pablo", "Patricia", "Rafael", "Sandra", "Victor", "Yolanda"};

        return nombres[(int) (Math.random() * nombres.length)];
    }

    public String crearApellido() {

        String[] apellidos = {
            "Garcia", "Olascuaga", "Flores", "Ribeira", "Lopez", "Ayala",
            "Zaragoza", "Bustos", "Gonzalez", "Perez", "Hernadez", "Smith",
            "Gomez", "Velazquez", "Molina", "Martinez", "Rodriguez", "Torres",
            "Sanchez", "Ramirez", "Castillo", "Ortiz", "Campos", "Vargas",
            "Guerrero", "Navarro", "Rojas", "Morales", "Paredes", "Bravo"};

        return apellidos[(int) (Math.random() * apellidos.length)];
    }

    public int crearIdentificacion() {
        return (+80000000 + (int) (Math.random() * 10000000));
    }

    public String crearEstadoCivil() {
        String estados[] = {"Soltero", "Sasado", "Divorciado", "Separado", "Viudo"};
        return estados[(int) (Math.random() * estados.length)];
    }

    public int crearAnio() {
        return (2000 + (int) (Math.random() * 24));
    }

    public int crearNumeroDespacho() {
        return (int) (Math.random() * 9) + 1;
    }

    public String crearDepartamentos() {
        String departametos[] = {
            "lenguajes", "Matemáticas", "Arquitectura", "Fisica", "Contabilidad", "Derecho",
            "Biologia", "Ciencia", "Economia"};
        return departametos[(int) (Math.random() * departametos.length)];
    }

    public String crearSeccion() {
        String seccion[] = {"biblioteca", "decanato", "secretaria", "limpieza", "comedor", "chofer", "supervisor"};
        return seccion[(int) (Math.random() * seccion.length)];
    }

    public String crearNombreCurso() {
        String curso[] = {"Cursos de negocios",
            "marketing","carrera profesional",
            "finanzas personales e ingresos secundarios",
            "arte, diseño y creatividad","tecnología",
            "crecimiento personal","familia y relaciones",
            "crianza para padres","estilo de vida"};
        return curso[(int) (Math.random() * curso.length)];
    }
}
