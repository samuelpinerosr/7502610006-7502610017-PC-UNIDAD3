package TALLER16.EJERCICIO2;

// Extensión: Excel
class ExportadorExcel extends ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento a formato Excel (.xlsx): " + contenido);
    }
}