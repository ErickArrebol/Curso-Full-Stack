package Servicio;

import Entidades.Editorial;
import Persistencia.DAOeditorial;
import java.util.List;
import java.util.Scanner;

public class ServicioEditorial {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void crearDatosEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean finalizar = true;
        do {
            System.out.print("Ingresa el nombre del editorial: ");
            String nombre = leer.next();
            if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                Editorial editorial = new Editorial(nombre);
                //editorial.setAlta(true);
                DAOeditorial dao = new DAOeditorial();
                dao.guardarEditorial(editorial);
                finalizar = false;
            } else {
                System.out.println("---------- ERROR ----------");
                System.out.println("El nombre no puede ir vacio");
                System.out.println("     Intenta nuevamente    ");
                System.out.println("---------------------------");
                System.out.println("");
            }
        } while (finalizar);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void crearDatosEditorialPorElLibro(String nombre) {
        Editorial editorial = new Editorial(nombre);
        DAOeditorial dao = new DAOeditorial();
        dao.guardarEditorial(editorial);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void editarDatosEditorial() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean finalizar = true;
        do {
            System.out.print("Ingresa el nombre del Editorial a editar: ");
            String nombre = leer.next();
            if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                DAOeditorial dao = new DAOeditorial();
                List<Editorial> listaDeEditoriales = dao.buscarEditorial(nombre);
                if (listaDeEditoriales.size() == 1) {
                    System.out.print("Ingresa el nuevo nombre: ");
                    String nuevoNombre = leer.next();
                    dao.editarEditorial(new Editorial(nuevoNombre));
                    finalizar = false;
                } else if (listaDeEditoriales.size() > 1) {
                    for (Editorial aux : listaDeEditoriales) {
                        System.out.println(aux.toString());
                    }
                    do {
                        try {
                            System.out.print("Ingresa el numero del editorial a editar: ");
                            int idEditorial = leer.nextInt();
                            for (int i = 0; i < listaDeEditoriales.size(); i++) {
                                if (listaDeEditoriales.get(i).getId() == idEditorial) {
                                    Editorial editorialEditar = listaDeEditoriales.get(i);
                                    System.out.println("Ingresa el nuevo nombre de Editorial");
                                    editorialEditar.setNombre(leer.next());
                                    finalizar = false;
                                } else {
                                    System.out.println("-ERROR- Numero de editorial invalido");
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("-------------- E R R O R --------------");
                            System.out.println("---- Solo debes de ingresar numero ----");
                            System.out.println("-Ingres cualquier letra para continuar-");
                            System.out.println("---------------------------------------");
                            leer.next();
                        }

                    } while (finalizar);

                }

            } else {
                System.out.println("---------- ERROR ----------");
                System.out.println("El nombre no puede ir vacio");
                System.out.println("     Intenta nuevamente    ");
                System.out.println("---------------------------");
                System.out.println("");
            }
        } while (finalizar);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void darDeBajaEditorialDatosEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean finalizar = true;
        do {
            System.out.print("Ingresa el nombre del Editorial que se dara de baja: ");
            String nombre = leer.next();
            if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                DAOeditorial dao = new DAOeditorial();
                List<Editorial> listaDeEditoriales = dao.buscarEditorial(nombre);
                if (listaDeEditoriales.size() == 1) {
                    Editorial editorialDeBaja = listaDeEditoriales.get(0);
                    editorialDeBaja.setAlta(false);
                    dao.darDeBajaEditorial(editorialDeBaja);
                    finalizar = false;
                } else if (listaDeEditoriales.size() > 1) {
                    for (Editorial aux : listaDeEditoriales) {
                        System.out.println(aux.toString());
                    }
                    int cont = 0;
                    do {
                        try {
                            System.out.print("Ingresa el numero del editorial que se dara de baja: ");
                            int idEditorial = leer.nextInt();
                            for (int i = 0; i < listaDeEditoriales.size(); i++) {
                                if (listaDeEditoriales.get(i).getId() == idEditorial) {
                                    Editorial editorialDeBaja = listaDeEditoriales.get(i);
                                    editorialDeBaja.setAlta(false);
                                    dao.darDeBajaEditorial(editorialDeBaja);
                                    cont = 1;
                                    finalizar = false;
                                }
                            }
                            if (cont == 0) {
                                System.out.println("-ERROR- Numero de editorial invalido");
                            }
                        } catch (Exception e) {
                            System.out.println("-------------- E R R O R --------------");
                            System.out.println("---- Solo debes de ingresar numero ----");
                            System.out.println("-Ingres cualquier letra para continuar-");
                            System.out.println("---------------------------------------");
                            leer.next();
                        }

                    } while (finalizar);

                }

            } else {
                System.out.println("---------- ERROR ----------");
                System.out.println("El nombre no puede ir vacio");
                System.out.println("     Intenta nuevamente    ");
                System.out.println("---------------------------");
                System.out.println("");
            }
        } while (finalizar);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void eliminarDatosEditorial() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean finalizar = true;
        do {
            System.out.print("Ingresa el nombre del Editorial a Eliminar: ");
            String nombre = leer.next();
            if (!nombre.trim().isEmpty() && !nombre.equalsIgnoreCase("null")) {
                DAOeditorial dao = new DAOeditorial();
                List<Editorial> listaDeEditoriales = dao.buscarEditorial(nombre);
                if (listaDeEditoriales.size() == 1) {
                    Editorial eliminarEditorial = listaDeEditoriales.get(0);
                    System.out.println(eliminarEditorial.toString());
                    System.out.println("Esta Editorial deseas Elimminar Si(s) o No(cualquier cracater)");
                    String r = leer.next();
                    if (r.equalsIgnoreCase("S")) {
                        dao.eliminarEditorial(eliminarEditorial);
                        finalizar = false;
                    } else {
                        System.out.println("Se cancelo la eliminacion de la editorial");
                        finalizar = false;
                    }

                } else if (listaDeEditoriales.size() > 1) {
                    for (Editorial aux : listaDeEditoriales) {
                        System.out.println(aux.toString());
                    }
                    int cont = 0;
                    do {
                        try {

                            System.out.print("Ingresa el numero del editorial a Eliminar: ");
                            int idEditorial = leer.nextInt();
                            for (int i = 0; i < listaDeEditoriales.size(); i++) {
                                if (listaDeEditoriales.get(i).getId() == idEditorial) {
                                    Editorial eliminarEditorial = listaDeEditoriales.get(0);
                                    dao.eliminarEditorial(eliminarEditorial);
                                    cont = 1;
                                    finalizar = false;
                                }
                            }
                            if (cont == 0) {
                                System.out.println("-ERROR- Numero de editorial invalido");
                            }
                        } catch (Exception e) {
                            System.out.println("-------------- E R R O R --------------");
                            System.out.println("---- Solo debes de ingresar numero ----");
                            System.out.println("-Ingres cualquier letra para continuar-");
                            System.out.println("---------------------------------------");
                            leer.next();
                        }

                    } while (finalizar);

                }

            } else {
                System.out.println("---------- ERROR ----------");
                System.out.println("El nombre no puede ir vacio");
                System.out.println("     Intenta nuevamente    ");
                System.out.println("---------------------------");
                System.out.println("");
            }
        } while (finalizar);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void crearDatosEditorialParaLibro(String nombre) {
        Editorial editorial = new Editorial(nombre);
        editorial.setAlta(true);
        DAOeditorial dao = new DAOeditorial();
        dao.guardarEditorial(editorial);
    }
}
