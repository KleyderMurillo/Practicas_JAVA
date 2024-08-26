package FigurasGeometricas;

class ObjGeometrico { // se crea la clase objGeometrico

    protected double px, py;

    public ObjGeometrico(double x, double y) { // se crea el constructor objGeometrico y se declaran "X" y "Y"
        px = x;
        py = y;
    }

    public ObjGeometrico() { // se crea el metodo objGeometrico
        px = py = 0;
    }

    public void imprimirCentro() { // se crea el metodo imprimirCentro
        System.out.println("(" + px + "," + py + ")"); // aqui se imprime el centro
    }
}