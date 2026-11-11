package TALLER16.EJERCICIO2;

// Clase principal con el método main (Única pública)
public class Main {
    public static void main(String[] args) {
        GestorDocumentos gestor = new GestorDocumentos();
        String documento = "Informe Final de POO";

        // Exportando a PDF
        gestor.exportarDocumento(new ExportadorPDF(), documento);

        // Exportando a Word
        gestor.exportarDocumento(new ExportadorWord(), documento);

        // Exportando a Excel
        gestor.exportarDocumento(new ExportadorExcel(), documento);
    }
}
