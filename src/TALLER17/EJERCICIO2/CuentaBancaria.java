package TALLER17.EJERCICIO2;

// Clase base CuentaBancaria
class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
        } else {
            System.out.println("Retiro rechazado: Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}