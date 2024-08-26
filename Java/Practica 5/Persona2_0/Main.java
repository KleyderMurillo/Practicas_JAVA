package Persona2_0;

import java.util.Scanner; // importamos la libreria escaner

public class Main{
    public static void main(String[] args) { // Declaracion de la clase principal

        Scanner entrada = new Scanner(System.in); // Inicializar el escanner
        Persona OPersona = new Persona(); // creamos el objeto "Opersona"

        System.out.println("Ingresa tu nombre"); // Entrada del primer dato
        String Nombre = entrada.nextLine(); // si el dato es String se usa nextLine si no, se usa nextInt
        OPersona.setNombre(Nombre); //se le asigna el valor al Nombre

        System.out.println("Ingresa tu apellido"); // Entrada del segundo dato
        String Apellido = entrada.nextLine(); // si el dato es String se usa nextLine si no, se usa nextInt
        OPersona.setApellido(Apellido); //se le asigna el valor al Apellido

        System.out.println("Ingresa la escolaridad"); // Entrada del tercer dato
        String Escolaridad = entrada.nextLine(); // si el dato es String se usa nextLine si no, se usa nextInt
        OPersona.setEscolaridad(Escolaridad); //se le asigna el valor a la escolaridad
        
        System.out.println("Ingresa tu año de nacimiento"); // Entrada del cuarto dato
        int AñoNacimiento = entrada.nextInt(); // si el dato es String se usa nextLine si no, se usa nextInt
        OPersona.setAñoNacimiento(AñoNacimiento); //se le asigna el valor al AñoNacimiento

        // Añadimos esta línea para consumir el carácter de nueva línea dejado por nextInt()
        entrada.nextLine();

        // Se imprimen los datos
        System.out.println("Tu nombre es: " + OPersona.getNombre() + " y tu apellido es: " + OPersona.getApellido() + 
        " tu escolaridad es: " + OPersona.getEscolaridad() + " y tu año de nacimiento es: " + OPersona.getAñoNacimiento());
    }
}