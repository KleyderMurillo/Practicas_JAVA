package Cumpleaños;

public class Main {

    public static void main(String[] args) { // clase main principal
        Cumpleaños OCumpleaños = new Cumpleaños(); // se crea el objeto OCumpleaños

        OCumpleaños.Nombre = "Kleyder"; // se asigna el nombre al objeto
        OCumpleaños.AñoNacimiento = 2005; // se asigna el año de nacimiento al objeto

        OCumpleaños.getNombre(); // se optiene el nombre
        OCumpleaños.calcularEdad(); // se optiene la edad de la persona
    }

}
