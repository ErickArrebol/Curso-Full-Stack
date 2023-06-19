/*Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te ha contratado 
“La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema que quiere 
realizar la empresa.

•Gestión Integral de clientes. En este módulo vamos a registrar la información personal de cada cliente 
que posea pólizas en nuestra empresa. 
--Nombre
--apellido
--documento
--mail
--domicilio
--teléfono.

•Gestión de vehículos. Se registra la información de cada vehículo asegurado. 
--Marca
--modelo
--año, 
--número de motor
--chasis
--color
--tipo (camioneta, sedán, etc.).

•Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un **vehículo**
como los datos de un solo ***cliente***. Los datos incluidos en ella son: 
-------número de póliza, 
--------fecha de inicio y 
--------fin de la póliza, 
--------cantidad de ***cuotas***, 
--------forma de pago, 
--------monto total asegurado, 
--------incluye granizo, 
--------monto máximo  granizo, 
--------tipo de cobertura (total, contra terceros, etc.). 
Nota: prestar atención al principio de este enunciado y pensar en las relaciones entre clases. 
Recuerden que pueden ser de uno a uno, de uno a muchos, 
de muchos a uno o de muchos a muchos.

•Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza. 
Esas cuotas van a contener la siguiente información: 
-----número de cuota    //mese a pagar, 
-----monto total de la cuota
-----si está o no pagada
-----fecha de vencimiento, 
-----forma de pago (efectivo, transferencia, etc.).

Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los requerimientos arriba 
descriptos. Modelando clases con atributos y sus correspondientes relaciones.
*/
package E_3_PolizasDeAutos;

/*@author Erick*/
public class Clientes {
    private String nombre, apellido;
    private String documento;
    private String mail, domicilio;
    private int teléfono;

    public Clientes(String nombre, String apellido, String documento, String mail, String domicilio, int teléfono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.teléfono = teléfono;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getMail() {
        return mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getTeléfono() {
        return teléfono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", mail=" + mail + ", domicilio=" + domicilio + ", tel\u00e9fono=" + teléfono + '}';
    }
    
    
}
