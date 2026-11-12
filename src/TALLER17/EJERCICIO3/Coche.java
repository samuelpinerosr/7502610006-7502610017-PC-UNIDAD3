package TALLER17.EJERCICIO3;

// Clase derivada Coche (Motorizado, respeta el contrato base)
class Coche extends Transporte {
    public Coche(String nombre) {
        super(nombre);
    }

    @Override
    public void desplazarse(String destino) {
        System.out.println("Conduciendo el coche [" + getNombre() + "] hacia " + destino + " por la carretera.");
    }
}
