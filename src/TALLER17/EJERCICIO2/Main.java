package TALLER17.EJERCICIO2;

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Ambas cuentas responden igual al contrato base de CuentaBancaria
        CuentaBancaria cuentaNormal = new CuentaBancaria(500);
        CuentaBancaria cuentaAhorros = new CuentaAhorros(1000, 2.5);

        procesarTransaccion(cuentaNormal, 200);
        procesarTransaccion(cuentaAhorros, 300);
    }

    public static void procesarTransaccion(CuentaBancaria cuenta, double montoRetiro) {
        System.out.println("--- Procesando transacción ---");
        cuenta.depositar(100);
        cuenta.retirar(montoRetiro);
    }
}