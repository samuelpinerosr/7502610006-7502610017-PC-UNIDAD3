package TALLER16.EJERCICIO1;

// 4. Procesador o Calculadora de Precios (Cerrado a la modificación)
public class CalculadoraPrecio {
    public double calcularPrecioFinal(double precioOriginal, Descuento descuento) {
        return descuento.aplicarDescuento(precioOriginal);
    }
}