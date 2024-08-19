package Excepcion;

class Excepcion{
    public static void main(String[] args) {
        try{ 
            // codigo que puede generar una excepcion
            int resultado = 10/0; // esto generará una excepción de division
        } catch(ArithmeticException e){
            // captura de la excepcion especifica
            System.out.println("Ocurrio una excepcion: " + e.getMessage());
        }
    }
}