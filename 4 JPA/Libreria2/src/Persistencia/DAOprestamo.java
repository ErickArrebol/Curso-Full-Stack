package Persistencia;

import Entidades.Prestamo;
import java.util.ArrayList;
import java.util.List;

public class DAOprestamo extends DAO<Prestamo>{

    public DAOprestamo() {
    }
    
    public void guardarPrestamo(Prestamo prestamo) {
        super.crear(prestamo);
    }
    
    public void editarPrestamo(Prestamo prestamo){
        super.editar(prestamo);
    }
    
    public void eliminarPrestamo(Prestamo prestamo){
        super.eliminar(prestamo);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List buscarPrestamoGeneral(long documento){
        List<Prestamo> listaPrestamos = new ArrayList<>();
        try {
            super.conectarBD();
            listaPrestamos = em.createQuery("SELECT p FROM Prestamo p JOIN p.cliente c WHERE c.documento = :documento", Prestamo.class)
                    .setParameter("documento", documento).getResultList();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            super.desconectarBD();
        }
        return listaPrestamos;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public List buscarPrestamoDevolucion(long documento){
        List<Prestamo> listaPrestamos = new ArrayList<>();
        try {
            super.conectarBD();
            listaPrestamos = em.createQuery("SELECT p FROM Prestamo p JOIN p.cliente c WHERE c.documento = :documento AND p.fechaDevolucion = null", Prestamo.class)
                    .setParameter("documento", documento).getResultList();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            super.desconectarBD();
        }
        return listaPrestamos;
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
