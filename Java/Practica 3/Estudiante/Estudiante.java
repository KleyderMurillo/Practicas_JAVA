package Estudiante;

class Estudiante{

    // Atributos - Propiedades
private String Nombre;
private int Edad;
private String Carrera;

public void setNombre(String Nombre){  // Metodo para asignar el nombre
    this.Nombre = Nombre;
}

public String getNombre(){ // Metodo para obtener el nombre
    return Nombre;
}

public void setEdad(int Edad){ // Metodo para asignar la edad
    this.Edad = Edad;
}

public int getEdad(){ // Metodo para obtener la edad
    return Edad;
}

public void setCarrera(String Carrera){ // Metodo para asignar la carrera
    this.Carrera = Carrera;
}

public String getCarrera(){ // Metodo para obtener la carrera
    return Carrera;
}

}
