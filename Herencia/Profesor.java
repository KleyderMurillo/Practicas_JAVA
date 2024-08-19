package Herencia;

public class Profesor extends Persona {
    String Especialidad;
    int Cedula;
    String Carrera_ad;

    public Profesor(String Nombre, int edad, String Especialidad, int Cedula, String Carrera_ad){
        super(Nombre, edad);
        this.Especialidad = Especialidad;
        this.Cedula = Cedula;
        this.Carrera_ad = Carrera_ad;
    }

    public void Mostrarinformacion(){
        super.Mostrarinformacion();
        System.out.println("La especialidad es: " + Especialidad);
        System.out.println("La cedula es: " + Cedula);
        System.out.println("La carrera es: " + Carrera_ad);
    }
}