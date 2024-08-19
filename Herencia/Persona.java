package Herencia;

public class Persona {
    String Nombre;
    int Edad;
    public Persona(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public void Mostrarinformacion(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }

}