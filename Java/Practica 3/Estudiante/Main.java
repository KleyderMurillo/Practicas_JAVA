package Estudiante;

import java.util.Scanner; // importamos la libreria escaner

public class Main {
    public static void main(String[] args) { // Declaracion de la clase principal
        Scanner entrada = new Scanner(System.in); // Inicializar el escanner
        Estudiante OEstudiante = new Estudiante(); // Creacion del ojeto OEstudiante a partir de la clase Estudiante

        System.out.println("ingresa tu nombre"); // Entrada del primer dato
        String Nombre = entrada.nextLine(); // si el dato es String se usa nextLine
        OEstudiante.setNombre(Nombre); //se le asigna el valor al nombre

        System.out.println("Ingresa tu edad"); // Entrada del segundo dato
        int Edad = entrada.nextInt(); // si el dato es int se usa nextInt
        OEstudiante.setEdad(Edad); // se le asigna el valor a la edad

        // Añadimos esta línea para consumir el carácter de nueva línea dejado por nextInt()
        entrada.nextLine();

        System.out.println("Ingresa la carrera"); // Entrada al tercer dato
        String Carrera = entrada.nextLine(); // si el dato es String se usa nextLine
        OEstudiante.setCarrera(Carrera); // se le asigna el valor a la carrera

        // Se imprimen los datos
        System.out.println("El nombre de la persona es: " + OEstudiante.getNombre() + " Su edad es de: " 
        + OEstudiante.getEdad() + " años " + " Su carrera es: " + OEstudiante.getCarrera());
    }
    
}