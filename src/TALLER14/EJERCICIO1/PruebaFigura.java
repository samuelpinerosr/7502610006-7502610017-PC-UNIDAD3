package TALLER14.EJERCICIO1;

public class PruebaFigura {
    public static void main(String[] args) {
        Figura fig1 = new Circulo(5.0);
        Figura fig2 = new Rectangulo(4.0, 6.0);

        fig1.calcularArea();
        fig2.calcularArea();
    }
}