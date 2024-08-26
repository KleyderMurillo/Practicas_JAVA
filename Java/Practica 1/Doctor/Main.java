package Doctor;

class Main { //clase main
    
    public static void main (String[] args){ // metodo main principal
        
        Doctor myDoctor = new Doctor(); //creacion de un objeto cuyo nombre es my Doctor
        
        myDoctor.name = "Alejandro Perez";   // asigna el valor de alejandro perez al nombre
        myDoctor.showName( ); // llama al comportamiento showName
    }
    
}
