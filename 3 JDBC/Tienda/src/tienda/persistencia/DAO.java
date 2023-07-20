package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*@author Erick */
public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement declaracion = null;

    private final String USUARIO = "root";
    private final String CONTRASENA = "root";
    private final String BD = "tienda";
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
