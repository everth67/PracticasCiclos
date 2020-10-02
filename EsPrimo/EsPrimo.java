
/**
 * Write a description of class EsPrimo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EsPrimo
{
   private int numero;
   private String mensaje;
   public EsPrimo(){
        numero = 0;
        mensaje = "";
   }
   public String calcular(int Numero){
        int dividendo;
        dividendo = 2;
        while(dividendo <= Numero ){
           if(Numero == dividendo){
              mensaje = "es primo";
           }else{
              if((Numero % dividendo) == 0){
                mensaje = " no es primo";
                dividendo = dividendo + Numero;
              } 
           }
           dividendo++;
        }
        return mensaje;
   }
}
