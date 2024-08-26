package SeleccionFutbol;

public class Entrenador extends SeleccionFutbol{

    private int idFederacion;

    public Entrenador(int id, String Nombre, String Apellidos, int edad, int idFederacion){
        super(idFederacion, Nombre, Apellidos, edad);
        this.idFederacion = idFederacion;

    }

    //Constructor getter y setter

    @Override
    public void entrenamiento(){
        System.out.println("Dirige un entrenamiento (clase entrenador)");
    }

    @Override
    public void partidofutbol(){
        System.out.println("Dirige un partido (clase entrenador)");
    }

    public void planificarEntrenamiento(){
        System.out.println("Planificar un entrenamiento");
    }
    
}
