package TALLER15.EJERCICIO1;

public class ReporteLibroService {
    public void generarReporte(Libro libro) {
        System.out.println("=== REPORTE DEL LIBRO ===");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getIsbn());
    }
}