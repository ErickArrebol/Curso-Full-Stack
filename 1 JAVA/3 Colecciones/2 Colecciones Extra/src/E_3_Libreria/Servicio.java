package E_3_Libreria;

public class Servicio {
    
   
    public String craerTitulos(int posicion){
        String[] titulosLibros = {
            "El gran Gatsby",
            "1984",
            "Don Quijote de la Mancha",
            "Cien años de soledad",
            "Matar a un ruiseñor",
            "Orgullo y prejuicio",
            "Ulises",
            "En busca del tiempo perdido",
            "El señor de los anillos",
            "Crimen y castigo"
        };

        return titulosLibros[posicion];
    }
    public String craerAutores(int posicion){
        String[] autoresLibros = {
            "F. Scott Fitzgerald",
            "George Orwell",
            "Miguel de Cervantes",
            "Gabriel García Márquez",
            "Harper Lee",
            "Jane Austen",
            "James Joyce",
            "Marcel Proust",
            "J.R.R. Tolkien",
            "Fyodor Dostoevsky"
        };
        return autoresLibros[posicion];
    }
    
    public int prestados(int cantidad){
        int prestados = (int) (Math.random() * cantidad);
        return prestados ;
    }
}
