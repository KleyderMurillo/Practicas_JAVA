package Herencia;

public class Estudiante extends Persona{
    String Matricula;
    
    public Estudiante(String Nombre, int Edad, String Matricula){
        super(Nombre, Edad);
        this.Matricula = Matricula;
    }

    public void Mostrarinformacion(){
        super.Mostrarinformacion();
        System.out.println("la matricula es: " + Matricula);
    }
}
