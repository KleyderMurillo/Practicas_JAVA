package NumerosDivisibles;

public class NumerosDivisibles {
    
    private int numero1, numero2 ;
    // La clase tiene dos atributos privados, numero1 y numero2, que se utilizarán para almacenar los números que se van a verificar
    
    public NumerosDivisibles (int num1, int num2){
   //El constructor de la clase recibe dos parámetros (num1 y num2) y los asigna a los atributos numero1 y numero2, respectivamente
        this.numero1 = num1;
        this.numero2 = num2;
    }
    public void ComproDivi(){
        /*verifica si numero1 es divisible por numero2 usando el operador de 
        módulo (%). Si numero1 % numero2 es igual a 0*/
        if (numero1 % numero2 == 0) {
            System.out.println("VERDADERO");
        }
        else{
            System.out.println("FALSO");
        }
    }
    
}