package TALLER17.EJERCICIO2;

// Clase derivada CuentaAhorros que respeta el LSP
class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Método propio de ahorro
    public void aplicarInteres() {
        double interes = saldo * (tasaInteres / 100);
        saldo += interes;
        System.out.println("Interés aplicado ($" + interes + "). Nuevo saldo: $" + saldo);
    }
}