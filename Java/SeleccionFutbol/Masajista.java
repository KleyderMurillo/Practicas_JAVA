package SeleccionFutbol;

public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int añosExperiencia;

    public Masajista(int id, String Nombre, String Apellidos, int edad, String titulacion, int añosExperiencia){
        super(id, Nombre, Apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;

    }

    // Constructor getter y setter

    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en el entrenamiento (clase masajista)");
    }

    public void darMasaje(){
        System.out.println("da un masaje");
    }
    
}
