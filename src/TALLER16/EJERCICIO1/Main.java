package TALLER16.EJERCICIO1;

// 5. Clase principal con el método main (Única pública)
public class Main {
    public static void main(String[] args) {
        CalculadoraPrecio calculadora = new CalculadoraPrecio();
        double precioBase = 100.0;

        System.out.println("Precio con 15% Descuento: $" +
                calculadora.calcularPrecioFinal(precioBase, new DescuentoPorcentaje(15)));

        System.out.println("Precio con $20 Descuento Fijo: $" +
                calculadora.calcularPrecioFinal(precioBase, new DescuentoFijo(20)));
    }
}
