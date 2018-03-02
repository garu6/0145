
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    private int Sinparam;
    
    private int dia;
    private int mes;
    private int año;
    private String fecha;
    
    
    /**
     * Constructor for objects of class CalendarioBasico
     */
   
    public CalendarioBasico()
    {
        dia =01;
        mes =01;
        año =01;
        
        
    }

   
    
   /**
     * A la hora de introducir el año introduce solo los dos ultimos dijitos
     * ya que nuestro calendario solo ocupa las fechas desde 2000 hasta 2099
     * por ejemplo si quieres introducir el año 2016 introduce 16
     * si quieres introducir el año 2007 introduce 07 y asi sucesivamente.
     */
   public void fijarFecha(int d, int m, int a)
   {
       dia = d;
       mes = m;
       año = a;
   }
   
   public void AvanzarDia(){
       dia ++;
       if (dia > 30){
           mes++;
           dia =1;
        }
        
       if (mes > 12 ){
           año ++;
           mes =1;
        }
       
       if ( año == 100 ){
           año =1;
        }
    }
    public String getFecha(){
        String fecha;
        fecha = dia + "-" + mes + "-" + año;
        return fecha;
    }
    
}

