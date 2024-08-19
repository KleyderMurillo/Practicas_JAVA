package Triangulo;

class Triangulo{
 private double Base, Altura; // se asigna el tipo de dato de la base y la altura
 public Triangulo(double B, double A){ // constructor que declara el tipo de dato de la base y la altura
 Base = B;
 Altura = A;
 }
 public double calcularArea(){ // metodo tipo double para calcular el area
 return (Base*Altura)/2; // operacion matematica para sacar el area del triangulo
 }
}