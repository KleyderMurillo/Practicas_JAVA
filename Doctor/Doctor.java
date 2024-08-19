package Doctor;

class Doctor {

    // Atributos - Propiedades

    int ID;
    String Nombre;
    String Especialidad;
    
    public void setID(int ID){  // Metodo para asignar el ID
        this.ID = ID;
    }

    public int getID(){ // Metodo para obtener el ID
        return ID;
    }

    public void setNombre(String Nombre){  // Metodo para asignar el nombre
        this.Nombre = Nombre;
    }

    public String getNombre(){ // Metodo para obtener el nombre
        return Nombre;
    }

    public void setEspecialidad(String Especialidad){  // Metodo para asignar la especialidad
        this.Especialidad = Especialidad;
    }

    public String getEspecialidad(){  // Metodo para obtener la especialidad
        return Especialidad;
    }
}
