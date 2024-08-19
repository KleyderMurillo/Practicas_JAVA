package CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria Ocuenta1 = new CuentaBancaria(1205, "Kleyder", 2000);
        CuentaBancaria Ocuenta2 = new CuentaBancaria(2005, "Trejo", 500);

        Ocuenta1.depositar(2310);
        Ocuenta1.retirar(600);
        System.out.println(Ocuenta1.toString());

        Ocuenta2.depositar(1500);
        Ocuenta2.retirar(800);
        System.out.println(Ocuenta2.toString());
    }
    
}
