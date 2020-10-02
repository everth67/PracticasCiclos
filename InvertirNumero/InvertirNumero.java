
/**
 * Write a description of class InvertirNumero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InvertirNumero
{
   private int numero;
   private String num;
   public InvertirNumero(){
      numero = 0;
      num = "";
   }
   public String ivertir(int Numero){
       while(Numero > 0){
           numero = Numero % 10;
           num = num +""+ numero;
           Numero = Numero / 10;
       }
       return num;
   }
}
