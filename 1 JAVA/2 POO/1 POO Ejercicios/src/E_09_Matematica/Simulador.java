/*Método Static y Clase Math
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
package E_09_Matematica;

/*@author Erick
 */
public class Simulador {

    public static void main(String[] args) {
        
        Simulador iniciarMain = new Simulador();
        Matematica objeto = iniciarMain.crearNumero();
        Servicio iniciarS = new Servicio();
       
       iniciarS.devolverMayor(objeto);
       iniciarS.calcularPotencia(objeto);
       iniciarS.calculaRaiz(objeto);
    }
    
   public static Matematica crearNumero (){
        
        System.out.println("-------------------------------");
        Matematica objeto = new Matematica();
        objeto.setN1((double) (Math.random() * 10));
        objeto.setN2((double) (Math.random() * 10));
        System.out.println(objeto.getN1());
        System.out.println(objeto.getN2());
        return objeto;
    }

}
