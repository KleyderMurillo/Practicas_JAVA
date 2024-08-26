package NumerosDivisibles;

import java.util.Scanner; // se importa la libreria scanner

public class Main {
    public static void main(String[]args){ // metodo main principal
        
        Scanner entrada = new Scanner(System.in);
        int num1 , num2;
        
        System.out.println("INGRESA EL PRIMER NUMERO: "); // se le pide al usuario el primer numero
        num1 = entrada.nextInt(); // entrada del primer numero
        System.out.println("INGRESA EL SEGUNDO NUMERO: "); // se le pide al usuario el segundo numero
        num2 = entrada.nextInt(); // entrada del segundo numero

        NumerosDivisibles ONums = new NumerosDivisibles(num1,num2); // se crea el objeto Onums
        ONums.ComproDivi(); // se comprueba si el numero es divisible y se imprime el resultado
        
    }
    
}