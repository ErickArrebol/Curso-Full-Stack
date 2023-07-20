package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Producto;

public final class productoDAO extends DAO {

    public List<String> obtenerNombresProductos() throws ClassNotFoundException {
        List<String> nombres = new ArrayList<>();
        try {
            String sql = "SELECT nombre FROM producto;";
            consultarBD(sql);
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                nombres.add(nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombres;
    }

    public List<String> obtenerNombresYPreciosProductos() throws ClassNotFoundException {
        List<String> nombresYPrecios = new ArrayList<>();
        try {
            conectarBD();
            String sql = "SELECT nombre, precio FROM producto";
            consultarBD(sql);
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                double precio = resultado.getDouble("precio");
                String nombreYPrecio = nombre + " - $" + precio;
                nombresYPrecios.add(nombreYPrecio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombresYPrecios;
    }

    public List<Producto> obtenerProductosEnRangoDePrecio(double minPrecio, double maxPrecio) throws ClassNotFoundException {
        List<Producto> productos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";
            consultarBD(sql);
            while (resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                double precio = resultado.getDouble("precio");
                int codigoFabricante = resultado.getInt("codigo_fabricante");
                Producto producto = new Producto(codigo, nombre, precio, codigoFabricante);
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    // Consulta d) Buscar y listar todos los Portátiles
    public List<Producto> obtenerPortatiles() throws ClassNotFoundException {
        List<Producto> portatiles = new ArrayList<>();
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portátil%'";
            consultarBD(sql);
            while (resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                double precio = resultado.getDouble("precio");
                int codigoFabricante = resultado.getInt("codigo_fabricante");
                Producto portatil = new Producto(codigo, nombre, precio, codigoFabricante);
                portatiles.add(portatil);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return portatiles;
    }

    public Producto obtenerProductoMasBarato() throws ClassNotFoundException, SQLException {
        Producto productoMasBarato = null;
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            consultarBD(sql);
            if (resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                double precio = resultado.getDouble("precio");
                int codigoFabricante = resultado.getInt("codigo_fabricante");
                productoMasBarato = new Producto(codigo, nombre, precio, codigoFabricante);
            }
        } catch (SQLException e) {
            throw e;
        }
        return productoMasBarato;
    }

    public void insertarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debes de ingresar los datos del producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES ('" + producto.getCodigo() + "', '" + producto.getNombre() + "', '" + producto.getPrecio() + "', '" + producto.getCodigo_Fabricante() + "' );";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            throw e;
        }
    }

    // Operación h) Editar un producto con datos a elección
    public void editarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debes de ingresar los datos del producto");
            }
            String sql = "UPDATE producto SET "
                    + "nombre ='" + producto.getNombre() + "', precio ='" + producto.getPrecio() + "', codigo_fabricante ='" + producto.getCodigo_Fabricante() 
                    + "' WHERE codigo = '" + producto.getCodigo() + "';";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            throw e;
        }
    }
    
    
}
