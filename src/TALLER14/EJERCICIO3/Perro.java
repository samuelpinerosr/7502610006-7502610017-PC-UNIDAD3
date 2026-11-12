package TALLER14.EJERCICIO3;

public class Perro extends Animal {
    // Método que existe únicamente en la clase derivada
    public void correr() {
        System.out.println("El perro está corriendo.");
    }

    // Mala práctica: sobrescribir un método sin modificar su comportamiento original
    @Override
    public void hacerSonido() {
        super.hacerSonido();
    }
}