package Doctor2_0; 

import java.util.Scanner; // importamos la libreria escaner

public class Main{
    public static void main(String[] args) {  // Declaracion de la clase principal
        
        Scanner entrada = new Scanner(System.in); // Inicializar el escanner
        Doctor ODoctor = new Doctor(); // creamos el objeto "ODoctor"

        System.out.println("ingresa el ID del doctor"); // Entrada del primer dato
        int ID = entrada.nextInt(); // si el dato es String se usa nextLine si no, se usa nextInt
        ODoctor.setID(ID); //se le asigna el valor al ID

        // Añadimos esta línea para consumir el carácter de nueva línea dejado por nextInt()
        entrada.nextLine();

        System.out.println("ingresa el Nombre del doctor"); // Entrada del segundo dato
        String Nombre = entrada.nextLine(); // si el dato es String se usa nextLine si no, se usa nextInt
        ODoctor.setNombre(Nombre); //se le asigna el valor al nombre

        System.out.println("ingresa la especialidad del doctor"); // Entrada del tercer dato
        String Especialidad = entrada.nextLine(); // si el dato es String se usa nextLine si no, se usa nextInt
        ODoctor.setEspecialidad(Especialidad); //se le asigna el valor a la especialidad

        // Se imprimen los datos
        System.out.println("El ID del doctor es: " + ODoctor.getID() + " Su nombre es: " + 
        ODoctor.getNombre() + " Su especialidad es: " + ODoctor.getEspecialidad());
    }
}