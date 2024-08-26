package SeleccionFutbol;

public abstract class SeleccionFutbol {
    
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int edad;

    public SeleccionFutbol(int id, String Nombre, String Apellidos,int edad){
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;

    }

    public void viajar(){
        System.out.println("Viajar (clase padre)");
    }

    public void concentrarse(){
        System.out.println("Concentrarse(clase padre)");
    }

    // IMPORTANTE -> METODO ABSTRACTO => no se implementa en la clase abstracta pero si en la clases hijas

    public abstract void entrenamiento();

    public void partidofutbol(){
        System.out.println("Asiste al partido de futbol (clase padre)");
    }

    public String getNombre(){
        return Nombre;
    }

    public String getApellidos(){
        return Apellidos;
    }
}
