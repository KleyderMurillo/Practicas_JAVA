package ComparacionNumero;

import java.util.Scanner;//Importacion de la clase Scanner

public class Main {
    public static void main(String[]args){//Argumento por defecto de la clase principal
        Scanner entrada = new Scanner(System.in);//Declarar objeto Scanner

        System.out.println("INGRESA UN NUMERO: ");//Imprimir instrucciones al usuario
        int num = entrada.nextInt();//Guardar valor introducido por el usuario en variable
        ComparacionNumero ONum = new ComparacionNumero(num); //Creacion del objeto a partir de la clase molde
        ONum.Imprimir();//LLamar el metodo que hace la comparacion del numero y imprime una leyenda
    }
}