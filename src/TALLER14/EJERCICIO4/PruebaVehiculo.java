package TALLER14.EJERCICIO4;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Coche();
        Vehiculo v2 = new Bicicleta();

        v1.mover();
        v2.mover();
    }
}