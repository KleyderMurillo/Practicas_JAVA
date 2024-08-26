package Persona;

public class Persona {

    // atributos-propiedades
    String Nombre;
    String Apellido;
    String Escolaridad;
    int AñoNacimiento;

    // comportamientos-metodos
    public void getNombre() { //metodo sin retorno para obtener el nombre 
        System.out.println(Nombre); // se imprime el nombre
    }

    public void calcularEdad() { //metodo sin retorno para calcular la edad
        int Edad = 2024 - AñoNacimiento; // se calcula la edad retando los años
        System.out.println(Edad); // se imprime el resultado de la resta
    }
}
