package TALLER15.EJERCICIO2;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("P-001", "Teclado Mecánico", 150000.0);

        CalculoPrecioService calculoService = new CalculoPrecioService();
        EtiquetaProductoService etiquetaService = new EtiquetaProductoService();

        double precioConIva = calculoService.calcularPrecioConIVA(producto, 0.19);
        etiquetaService.generarEtiqueta(producto, precioConIva);
    }
}