
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    private int Sinparam;
    
    private int d;
    private int m;
    private int a;
    private String fecha;
    
    
    /**
     * Constructor for objects of class CalendarioBasico
     */
   
    public CalendarioBasico()
    {
        d =01;
        m =01;
        a =01;
        
        
    }

   
    
   /**
     * A la hora de introducir el año introduce solo los dos ultimos dijitos
     * ya que nuestro calendario solo ocupa las fechas desde 2000 hasta 2099
     * por ejemplo si quieres introducir el año 2016 introduce 16
     * si quieres introducir el año 2007 introduce 07 y asi sucesivamente.
     */
   public void fijarFecha(int dia, int mes, int ano)
   {
       d = dia;
       m = mes;
       a = ano;
   }
   
   public void AvanzarFecha(){
       d ++;
       if (d > 30){
           m++;
           d =1;
        }
        
       if (m > 12 ){
           a ++;
           m =1;
        }
       
       if ( a == 100 ){
           a =1;
        }
    }
    public String obtenerFecha(){
        String fecha;
        fecha = d + "-" + m + "-" + a;
        return fecha;
    }
    
}

