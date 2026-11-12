package TALLER17.EJERCICIO3;

// Clase derivada Bicicleta (Sin motor, pero respeta el contrato base)
class Bicicleta extends Transporte {
    public Bicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void desplazarse(String destino) {
        System.out.println("Pedaleando la bicicleta [" + getNombre() + "] hacia " + destino + ".");
    }
}