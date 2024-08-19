package Persona;

class Persona {

    // atributos-propiedades
    String Nombre;
    String Apellido;
    String Escolaridad;
    int AñoNacimiento;

     // comportamientos-metodos

    public void setNombre (String Nombre){ // Metodo para asignar el nombre
        this.Nombre = Nombre;
    }

    public String getNombre(){ // Metodo para obtener el nombre
        return Nombre;
    }

    public void setApellido(String Apellido){ // Metodo para asignar el apellido
        this.Apellido = Apellido;
    }

    public String getApellido(){ // Metodo para obtener el apellido
        return Apellido;
    }

    public void setEscolaridad(String Escolaridad){ // Metodo para asignar la escolaridad
        this.Escolaridad = Escolaridad;
    }

    public String getEscolaridad(){ // Metodo para obtener la escolaridad
        return Escolaridad;
    }

    public void setAñoNacimiento(int AñoNacimiento){ // Metodo para asignar el año de nacimiento
        this.AñoNacimiento = AñoNacimiento;
    }

    public int getAñoNacimiento(){ // Metodo para obtener el año de nacimiento
        return AñoNacimiento;
    }
    
}