package TALLER14.EJERCICIO2;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor();

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}