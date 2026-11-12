package TALLER15.EJERCICIO2;

public class EtiquetaProductoService {
    public void generarEtiqueta(Producto producto, double precioFinal) {
        System.out.println("=== ETIQUETA DE PRODUCTO ===");
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio Final: $" + String.format("%.2f", precioFinal));
    }
}