package Persona;

class Main {

    public static void main(String[] args) {
        Persona OPersona = new Persona(); //creacion de un objeto cuyo nombre es Opersona

        OPersona.Nombre = "Kleyder"; // se le asigna un nombre al objeto persona
        OPersona.AñoNacimiento = 2005; // se le asigna un nombre al año de nacimiento

        OPersona.getNombre(); // llama al comportamiento getNombre
        OPersona.calcularEdad(); // llama al comportamiento calcularEdad
    }

}