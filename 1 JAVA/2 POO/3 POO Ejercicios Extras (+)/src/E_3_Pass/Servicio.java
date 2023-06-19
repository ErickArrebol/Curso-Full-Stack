package E_3_Pass;

public class Servicio {
    
    private Pass passObj;

    public Servicio(Pass passObj) {
        this.passObj = passObj;
    }

    public void crearPass(String nuevaPass) {
        if (nuevaPass.length() == 10) {
            passObj.setPass(nuevaPass);
            System.out.println("Contraseña asignada correctamente.");
        } else {
            System.out.println("La contraseña debe tener una longitud de 10 caracteres.");
        }
    }

    public void analizarPass() {
        String pass = passObj.getPass();
        if (pass.contains("z") && pass.replaceAll("[^a]", "").length() >= 2) {
            System.out.println("Nivel ALTO: La contraseña contiene al menos una 'z' y al menos dos 'a'.");
        } else if (pass.contains("z")) {
            System.out.println("Nivel MEDIO: La contraseña contiene al menos una 'z'.");
        } else {
            System.out.println("Nivel BAJO: La contraseña no cumple las condiciones requeridas.");
        }
    }

    public void modificarPass(String passActual, String nuevaPass) {
        if (passObj.getPass().equals(passActual)) {
            crearPass(nuevaPass);
        } else {
            System.out.println("Contraseña incorrecta. No se permite modificar la contraseña.");
        }
    }

    public void modificarNombre(String pass, String nuevoNombre) {
        if (passObj.getPass().equals(pass)) {
            passObj.setNombre(nuevoNombre);
            System.out.println("Nombre modificado correctamente.");
        } else {
            System.out.println("Contraseña incorrecta. No se permite modificar el nombre.");
        }
    }

    public void modificarDNI(String pass, int nuevoDNI) {
        if (passObj.getPass().equals(pass)) {
            passObj.setDni(nuevoDNI);
            System.out.println("DNI modificado correctamente.");
        } else {
            System.out.println("Contraseña incorrecta. No se permite modificar el DNI.");
        }
    }


}
