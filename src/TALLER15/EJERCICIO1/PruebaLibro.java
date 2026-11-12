package TALLER15.EJERCICIO1;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728");

        ReporteLibroService reporteService = new ReporteLibroService();
        PersistenciaLibroService persistenciaService = new PersistenciaLibroService();

        reporteService.generarReporte(libro);
        persistenciaService.guardarEnBaseDeDatos(libro);
    }
}