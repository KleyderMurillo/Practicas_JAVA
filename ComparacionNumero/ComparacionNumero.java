package ComparacionNumero;

public class ComparacionNumero { // Nombre de la clase
    
    public int numero; //Arributo de la clase
    
    public ComparacionNumero(int n){//Metodo constructor 
        this.numero = n;
    }

    public void Imprimir(){ //Metodo que compara un numero y imprime una leyenda 
        if (numero > 0) { // Se compara si el valor del numero es mayor a cero
            System.out.println("EL NUMERO ES MAYOR QUE CERO");//Si la condicion se cumple, imprime esta leyenda
        }
        else    {
            System.out.println("EL NUMERO ES MENOR QUE CERO");//Si la condicion no se comple, imprime esta leyenda
        }
    }
}