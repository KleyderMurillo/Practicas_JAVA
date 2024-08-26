package CuentaBancaria;

public class CuentaBancaria {
    int numeroCuenta;
    String titular;
    double saldo;

    public CuentaBancaria(int NC, String T, double s) {
        numeroCuenta = NC;
        titular = T;
        saldo = s;
    }

    public double depositar(double d) {
        if (d > 0) {
            saldo += d;
            System.out.println("Se han ingresado " + d + " a su saldo");
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0");
        }
        return saldo;
    }

    public double retirar(double r) {
        if (r > 0 && saldo >= r) {
            saldo -= r;
            System.out.println("Se han retirado " + r + " de su saldo");
        } else {
            System.out.println("El saldo es insuficiente o el monto a retirar es inválido");
        }
        return saldo;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public String toString() {
        return " numero de la cuenta: " + numeroCuenta + " titular: " + titular + " saldo actual: " + saldo;
    }
}