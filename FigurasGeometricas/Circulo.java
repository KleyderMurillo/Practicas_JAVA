package FigurasGeometricas;

public class Circulo extends ObjGeometrico { // se crea la clase circulo y se le añade la extension objGeometrico

    private double radio;
    private final double PI = 3.1416;

    public Circulo(double x, double y, double r) { // se crea el constructor 

        super(x, y); // llama a constructor de la clase base

        radio = r; // se agrega el radio
    }

    public double area() { // se crea el metodo area
        return PI * radio * radio;
    }
}
