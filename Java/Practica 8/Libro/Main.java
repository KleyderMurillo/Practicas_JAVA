package Libro;

public class Main {

    public static void main(String[] args) { // clase main principal
        Libro OLibro1 = new Libro(19284, "Programacion", "Leonardo", 300); // se crea un objeto y se asignan los datos
        Libro OLibro2 = new Libro(579165, "Electricidad y magnetismo", "Tesla", 247); // se cra un objeto y se asignan los datos

        System.out.println(OLibro1.toString()); // se imprimen los datos del objeto 1
        System.out.println(OLibro2.toString()); // se imprimen los datos del objeto 2
    }
    
}