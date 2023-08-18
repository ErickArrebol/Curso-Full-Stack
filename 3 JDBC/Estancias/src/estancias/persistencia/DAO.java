package estancias.persistencia;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public abstract class  DAO {
    
    protected Connection conexion = null;//se utilizará para almacenar la conexión a la base de datos. Es de tipo Connection, que es una interfaz proporcionada por JDBC (Java Database Connectivity) para interactuar con bases de datos.
    protected ResultSet resultado = null;//se utilizará para almacenar el resultado de una consulta a la base de datos. Es de tipo ResultSet, que representa el conjunto de resultados de una consulta.
    protected Statement declaracion = null;//se utilizará para crear y ejecutar declaraciones SQL. Es de tipo Statement, que es una interfaz utilizada para ejecutar instrucciones SQL estáticas.

    private final String USUARIO = "root";
    private final String CONTRASENA = "root";
    private final String BD = "estancias_exterior";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarBD() throws ClassNotFoundException, SQLException {

        try {
            Class.forName(DRIVER);
            String urlBD = "jdbc:mysql://localhost:3306/" + BD + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBD, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    protected void desconectarBD() throws SQLException {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (declaracion != null) {
                declaracion.close();
            }
            if (conexion != null) {
                conexion.close();
            }

        } catch (SQLException e) {
            throw e;
        }
    }

    protected void insertarModificarEliminar(String sql) throws ClassNotFoundException, SQLException {
        try {
            conectarBD();
            declaracion = conexion.createStatement();
            declaracion.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }finally{
            desconectarBD();
        }
    }
    
    protected void consultarBD(String sql) throws ClassNotFoundException, SQLException{
        try {
            conectarBD();
            declaracion = conexion.createStatement();
            resultado = declaracion.executeQuery(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
}
