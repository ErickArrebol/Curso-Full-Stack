package tienda.persistencia;

import java.sql.SQLException;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;


public class fabricanteDAO extends DAO {

    // Operación g) Ingresar un fabricante a la base de datos
    public void insertarFabricante(Fabricante fabricante) throws ClassNotFoundException, SQLException {
        try {
            String sql = "INSERT INTO fabricante (codigo, nombre)"
                    + "VALUES ('" + fabricante.getCodigo() + "', '" + fabricante.getNombre()+"' );";
            insertarModificarEliminar(sql);

        } catch (SQLException e) {
            throw e;
        }
    }

    

 

   
}
