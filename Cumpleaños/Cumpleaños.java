package Cumpleaños;

import java.time.LocalDate; // importamos la libreria para obtener la fecha y hora actuales

class Cumpleaños {

    // atributos-propiedades
    String Nombre;
    String Apellido;
    String Escolaridad;
    int AñoNacimiento;

    // comportamientos-metodos
    public void getNombre() { // metodo sin retorno para imprimir el nombre
        System.out.println(Nombre);
    }

    public void calcularEdad() { // metodo sin retorno
        LocalDate fecha_actual = LocalDate.now(); // se obtiene la fecha actual
        int año_actual = fecha_actual.getYear(); // de la fecha actual se obtiene el año
        int edad = año_actual - AñoNacimiento; // se resta el año actual con la edad
        System.out.println(edad); // se imprime el resultado
    }
}