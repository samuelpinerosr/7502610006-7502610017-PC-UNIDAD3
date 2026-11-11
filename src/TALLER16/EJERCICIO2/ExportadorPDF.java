package TALLER16.EJERCICIO2;

// Implementación: PDF
class ExportadorPDF extends ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento a formato PDF: " + contenido);
    }
}
