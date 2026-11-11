package TALLER16.EJERCICIO2;

// Extensión: Word
class ExportadorWord extends ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento a formato Word (.docx): " + contenido);
    }
}