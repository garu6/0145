
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    
    
    private DisplayDosCaracteres dia ;
    private DisplayDosCaracteres mes ;
    private DisplayDosCaracteres ano ;
    private DisplayDosCaracteres maximod;

    /**
     * Constructor for objects of class CalendarioBasico
     */
   
    public CalendarioBasico()
    {
        dia =  new DisplayDosCaracteres(31);
        mes =  new DisplayDosCaracteres(13);
        ano =  new DisplayDosCaracteres(100);
        
    }
    
   /**
     * A la hora de introducir el año introduce solo los dos ultimos dijitos
     * ya que nuestro calendario solo ocupa las fechas desde 2000 hasta 2099
     * por ejemplo si quieres introducir el año 2016 introduce 16
     * si quieres introducir el año 2007 introduce 07 y asi sucesivamente.
     */
   public void fijarFecha(int adia, int ames, int aano)
   {
       dia.setValorAlmacenado(adia);
       mes.setValorAlmacenado(ames);
       ano.setValorAlmacenado(aano);
   }
   
   public void avanzarFecha(){
      dia.incrementaValorAlmacenado();
      if (dia.getValorAlmacenado()  == 1 ){
          mes.incrementaValorAlmacenado();
        }
        
      if (mes.getValorAlmacenado() == 1){
          if (dia.getValorAlmacenado() == 1){
              ano.incrementaValorAlmacenado();
            }
        }
}
    
    public String obtenerFecha(){
        return dia.getTextoDelDisplay() + "-" +  mes.getTextoDelDisplay() + "-" +  ano.getTextoDelDisplay();
        
    }

}


