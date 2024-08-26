package FigurasGeometricas;

public class Main {

    public static void main(String[] ar) { // metodo main principal 
        Circulo Ocr = new Circulo(2, 2.5, 2); // se crea un objeto de la clase circulo
        Cuadrado Ocd = new Cuadrado(3, 3.5, 26.37, 3.85); // se crea un objeto de la clase cuadrado
        System.out.print("Centro del circulo: ");
        Ocr.imprimirCentro(); // se llama al metodo imrpimirCentro
        System.out.print("Centro del cuadrado: ");
        Ocd.imprimirCentro(); // se llama al metodo imprimirCentro
        System.out.println("Area del circulo: " + Ocr.area()); // se imprime el area del circulo
        System.out.println("Area del cuadrado: " + Ocd.area()); // se imprime el area del cuadrado
    }
}
