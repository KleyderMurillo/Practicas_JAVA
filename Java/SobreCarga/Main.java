package SobreCarga;
// clase con el método main()
public class Main{
 public static void main(String []args){
   Sobrecarga objeto = new Sobrecarga();
   // llamada a los métodos sobrecargados
   objeto.prueba();
   objeto.prueba(29);
   objeto.prueba(21,19);
   objeto.prueba(-2.5,10.0,5.1);
 }
}