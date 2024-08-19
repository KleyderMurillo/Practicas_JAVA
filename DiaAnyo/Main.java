package DiaAnyo;

import java.io.IOException; // se importan librerias de excepcion
import java.util.Scanner; // se importa la libreria scanner

public class Main {
    public static void main(String[] ar)throws IOException{ // metodo main principal
        
        DiaAnyo hoy;
        DiaAnyo cumpleanyos;

        int d, m; // se declaran los tipo de dato

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca fecha de hoy, dia: ");
        d = entrada.nextInt(); // entrada de datos
        System.out.print("Introduzca el número de mes: ");
        m = entrada.nextInt(); // entrada de datos
        hoy = new DiaAnyo(d,m);
        System.out.print("Introduzca su fecha de nacimiento, dia: ");
        d = entrada.nextInt(); // entrada de datos
        System.out.print("Introduzca el número de mes: ");
        m = entrada.nextInt(); // entrada de datos
        cumpleanyos = new DiaAnyo(d,m);
        System.out.print( " La fecha de hoy es ");
        hoy.visualizar(); // se llama al metodo hoy.visualizar
        System.out.print( " Su fecha de nacimiento es ");
        cumpleanyos.visualizar();
        if (hoy.igual(cumpleanyos)){ // se comparan las fechas para saber si son iguales
        System.out.println( "¡Feliz cumpleaños! ");
        } else {
        System.out.println( "¡Feliz dia! ");
        }
    }
}