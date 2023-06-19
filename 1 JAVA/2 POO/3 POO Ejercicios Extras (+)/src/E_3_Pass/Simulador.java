/*Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.

Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios*/
package E_3_Pass;

/**@author Erick*/
public class Simulador {

    public static void main(String[] args) {
        
        Pass usuario = new Pass("contraseña123", "Juan Pérez", 12345678);
        Servicio iniciarS = new Servicio(usuario);

        System.out.println("--- Menú de opciones ---");
        System.out.println("A) Ingresar contraseña");
        System.out.println("B) Mostrar nivel de la contraseña");
        System.out.println("C) Modificar contraseña");
        System.out.println("D) Modificar nombre");
        System.out.println("E) Modificar DNI");

        String opcion = "A"; // Ingrese la opción deseada

        if (opcion.equalsIgnoreCase("A")) {
            System.out.print("Ingrese una nueva contraseña: ");
            String nuevaPass = "nuevaContraseña"; // Ingrese la nueva contraseña
            iniciarS.crearPass(nuevaPass);
        } else if (opcion.equalsIgnoreCase("B")) {
            iniciarS.analizarPass();
        } else if (opcion.equalsIgnoreCase("C")) {
            System.out.print("Ingrese la contraseña actual: ");
            String passActual = "contraseña123"; // Ingrese la contraseña actual
            System.out.print("Ingrese la nueva contraseña: ");
            String nuevaPass = "nuevaContraseña"; // Ingrese la nueva contraseña
            iniciarS.modificarPass(passActual, nuevaPass);
        } else if (opcion.equalsIgnoreCase("D")) {
            System.out.print("Ingrese la contraseña: ");
            String pass = "contraseña123"; // Ingrese la contraseña
            System.out.print("Ingrese el nuevo nombre: ");
            String nuevoNombre = "Nuevo Nombre"; // Ingrese el nuevo nombre
            iniciarS.modificarNombre(pass, nuevoNombre);
        } else if (opcion.equalsIgnoreCase("E")) {
            System.out.print("Ingrese la contraseña: ");
            String pass = "contraseña123"; // Ingrese la contraseña
            System.out.print("Ingrese el nuevo DNI: ");
            int nuevoDNI = 98765432; // Ingrese el nuevo DNI
            iniciarS.modificarDNI(pass, nuevoDNI);
        }
    }
    
}
