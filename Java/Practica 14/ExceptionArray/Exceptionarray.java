package ExceptionArray;

public class Exceptionarray {
    public static void main(String[] args) {
        try{
            int [] arreglo = new int[4]; // se crea un arreglo de 4 pocisiones
            System.out.println("intentando ingresar a un arreglo");
            // genera excepcion tipo ArrayIndexOutBoundsException
            int valor = arreglo[5]; /*  se crea un arreglo de 5 pocisiones generando 
            un error ya que el arreglo creado es de 4 pocisiones, no de 5*/
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("se a producido un error de tipo " + e.getMessage()); // se obtiene el mensaje de error
        }
        finally{
            System.out.println("el bloque finally se ejecutara siempre exista una excepción o no"); // esta linea se ejecuta siempre
        }
    }
    
}