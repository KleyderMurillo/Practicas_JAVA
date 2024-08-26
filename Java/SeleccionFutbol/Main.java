package SeleccionFutbol;

import java.util.ArrayList;

public class Main {
    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList <SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "delBosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2,"Andres","Iniesta",29,6,"Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3,"Raul","Martinez",41,"Licenciado en Fisioterapia",18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        //Concentracion

        System.out.println("Todos los integrantes comienzan una concentracion. (todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() + "" + integrante.getApellidos() + " -> ");
            integrante.concentrarse();
        }

        // Viaje

        System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.getNombre() + "" + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }

        // Entrenamiento
        System.out.println("Entrenamiento: Todos los integrantes tienen su funcion en un entrenamiento (Especializacion)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.getNombre() + "" + integrante.getApellidos() + " -> ");
            integrante.entrenamiento();
        }

        // Partido de Futbol
        System.out.println("Partido de Futbol: Todos los integrantes tienen su funcion en un Partido (Especializacion)");
        for (SeleccionFutbol integrante : integrantes){
        System.out.println(integrante.getNombre() + "" + integrante.getApellidos() + " -> ");
        integrante.partidofutbol();
        }

        // Planificar entrenamiento
        System.out.println("Planificar Entrenamiento: Solo el entrenador tiene el metodo para planificar un entrenamiento");
        System.out.print(delBosque.getNombre() + "" + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).planificarEntrenamiento();

        // Entrevista
        System.out.println("Entrevista: Solo el futbolista tiene el método para dar una entrevista:");
        System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        ((Futbolista) iniesta).entrevista();

        // Masaje
        System.out.println("Masaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();
    }
    
}
