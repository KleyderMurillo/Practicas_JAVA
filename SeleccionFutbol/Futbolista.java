package SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String Nonbre, String Apellidos, int edad, int dorsal, String demarcacion){
        super(id, demarcacion, Apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;

    }

    // Constructor getter y setter

    @Override
    public void entrenamiento(){
        System.out.println("realiza un entrenmiento (clase futbolista)");
    }

    @Override
    public void partidofutbol(){
        System.out.println("Juega un partido (clase futbolista)");
    }

    public void entrevista(){
        System.out.println("Da una entrevista");
    }
}
