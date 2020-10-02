
/**
 * Write a description of class NumeroPerfecto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumeroPerfecto
{
    private String mensaje;
    public NumeroPerfecto(){
        mensaje = "";
    }
    public String calcular(int numero){
       int divisor, suma;
       divisor = 0;
       suma = 0;
       while(divisor < numero){
         divisor++;
         if((numero % divisor)==0){
            suma = suma + divisor;
         }
         if(suma == numero){
             mensaje = numero + " Es perfecto";
         }else{
           if(suma < numero){
              mensaje = numero +" no es perfecto";
           }   
         }
       }
       return mensaje;
    }
}
