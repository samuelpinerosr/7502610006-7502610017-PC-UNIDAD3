package TALLER17.EJERCICIO1;

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Demostración de LSP: Podemos tratar a Circulo y Rectangulo como Figura
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);

        imprimirArea(miCirculo);    // Salida esperada: Área: 78.5398...
        imprimirArea(miRectangulo); // Salida esperada: Área: 24.0
    }

    // Este método acepta cualquier Figura y garantiza que funcionará correctamente
    public static void imprimirArea(Figura figura) {
        System.out.println("Área de la figura: " + figura.calcularArea());
    }
}
