package TALLER16.EJERCICIO1;

// 3. Extensión para Descuento Fijo (sin modificar la clase base ni el procesador)
public class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return Math.max(0, precioOriginal - montoFijo);
    }
}