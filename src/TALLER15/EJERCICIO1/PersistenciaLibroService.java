package TALLER15.EJERCICIO1;

public class PersistenciaLibroService {
    public void guardarEnBaseDeDatos(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' (ISBN: " + libro.getIsbn() + ") en la base de datos...");
    }
}