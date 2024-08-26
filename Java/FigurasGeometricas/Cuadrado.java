package FigurasGeometricas;

public class Cuadrado extends ObjGeometrico {

    private double x1, y1;

    public Cuadrado(double xc, double yc, double t1, double t2) { // se crea el constructor y se declaran los tipo de dato
        super(xc, yc); // llama a constructor de la clase base
        x1 = t1;
        y1 = t2;
    }

    public double area() { // se crea el metodo area
        double a, b; // se declara el tipo de dato
        a = px - x1;
        b = py - y1;
        return 2 * (a * a + b * b);
    }
}
