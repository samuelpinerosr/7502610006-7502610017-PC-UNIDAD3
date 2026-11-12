package TALLER14.EJERCICIO3;

public class PruebaPolimorfismoIncorrecto {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();

        // 1. Error de compilación se quita //: correr() no está definido en la clase base Animal
        // miAnimal.correr();

        // 2. Compila, pero ejecuta exactamente lo mismo que Animal sin aportar especialización
        miAnimal.hacerSonido();
    }
}