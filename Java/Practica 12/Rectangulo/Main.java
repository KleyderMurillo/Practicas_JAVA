package Rectangulo;

public class Main
{
 public static void main(String ar[]) // metodo main principal
 {
 Rectangulo r = new Rectangulo(3.0,7.0); // se crea el objeto r y se le asigna el valor de la altura y la base
 System.out.println(" El área es " + r.calcularArea()); // se imprime el area del rectangulo
 }
}