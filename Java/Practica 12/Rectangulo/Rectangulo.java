package Rectangulo;

class Rectangulo
{
 private double base, altura; // se le asigna el tipo de dato a la base y la altura
 public Rectangulo(double b, double h) // constructor que asigna el tipo de dato a la base y la altura
 {
 base = b;
 altura = h;
 }
 public double calcularArea() // metodo double para sacar el area del circulo
 {
 return base*altura; // operacion matematica para obtener la base y la altura del rectangulo
 }
}