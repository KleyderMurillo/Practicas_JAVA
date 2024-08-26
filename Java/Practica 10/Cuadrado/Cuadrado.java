package Cuadrado;

class Cuadrado{
 private double Lado; // se le asigna el tipo de dato al lado del cuadrado
 public Cuadrado(double L){ // constructor que declara el tipo de dato del lado
 Lado = L;
 }
 public double calcularArea(){ // metodo tipo dobule para calcular la edad
 return Math.pow(Lado, 2); // operacion matematica para sacar el area del cuadrado
 }
}