
/**
 * Write a description of class CalcularDigito here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcularDigito
{
   public int calcularDigito(int numero){
       int contador;
       contador = 0;
       while(numero > 0){
          numero = numero / 10;
          contador ++;
       }
       return contador;
   }
}
