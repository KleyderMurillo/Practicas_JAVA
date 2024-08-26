package Herencia;

public class Main {
    public static void main(String[] args) {
        Estudiante Oest = new Estudiante("Carlos", 18, "MUMK");
        Oest.Mostrarinformacion();
        Profesor Oprofesor = new Profesor("Cuadros", 25, "Doctor", 197854, "TICS");
        Oprofesor.Mostrarinformacion();
    }
    
}