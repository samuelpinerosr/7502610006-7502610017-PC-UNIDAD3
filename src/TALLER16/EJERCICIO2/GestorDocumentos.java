package TALLER16.EJERCICIO2;

// Gestor cerrado a modificaciones
class GestorDocumentos {
    public void exportarDocumento(ExportadorDocumento exportador, String contenido) {
        exportador.exportar(contenido);
    }
}