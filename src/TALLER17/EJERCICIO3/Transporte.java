package TALLER17.EJERCICIO3;

// Clase base abstracta Transporte
abstract class Transporte {
    private String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Comportamiento universal para todo transporte
    public abstract void desplazarse(String destino);
}