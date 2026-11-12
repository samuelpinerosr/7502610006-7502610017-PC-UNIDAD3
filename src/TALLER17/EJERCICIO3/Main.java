package TALLER17.EJERCICIO3;

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Cumplimiento de LSP: Ambas instancias sustituyen a Transporte sin fallar
        Transporte miBici = new Bicicleta("Bici de Montaña");
        Transporte miCoche = new Coche("Sedán 4x4");

        iniciarViaje(miBici, "el parque");
        iniciarViaje(miCoche, "la universidad");
    }

    // Método que demuestra polimorfismo y sustitución de Liskov
    public static void iniciarViaje(Transporte transporte, String destino) {
        transporte.desplazarse(destino);
    }
}
