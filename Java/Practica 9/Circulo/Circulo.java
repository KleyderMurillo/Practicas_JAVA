package Circulo;

import java.lang.Math; // se importa la libreria

public class Circulo {
    private double Radio; // se declara el tipo de dato que tendra el radio
    public Circulo(double R){ // se declara un constructor que declara el tipo de dato del radio
    Radio = R;
    }
    public double calcularArea(){ // se realiza un metodo tipo double para poder sacar el area del circulo
    return Math.PI * (Math.pow(Radio, 2)); // operacion matematica para sacar el area del circulo
    }
}