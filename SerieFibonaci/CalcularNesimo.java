

/**
 * Write a description of class CalcularNesimo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcularNesimo
{
   private int a, b, c;
   private int contador;
   private int limite;
   public CalcularNesimo(){
       a = 0;
       b = 1;
       c = 0;
       contador = 1;
       limite = 0;
   }
   public int Calcular(int digito){
       for(int i = digito; contador <= i; contador++){
          c = a + b;
          b = a;
          a = c;  
      }
      return c;
   }
}
