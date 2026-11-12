package TALLER15.EJERCICIO2;

public class CalculoPrecioService {
    public double calcularPrecioConIVA(Producto producto, double porcentajeIva) {
        return producto.getPrecioBase() * (1 + porcentajeIva);
    }

    public double calcularPrecioConDescuento(Producto producto, double porcentajeDescuento) {
        return producto.getPrecioBase() * (1 - porcentajeDescuento);
    }
}