
/**
 * Write a description of class FechaYHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    
    private CalendarioBasico fecha;
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String adevolver;
    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        fecha = new CalendarioBasico();
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        
    }

    public String getFechaYHora(){
        
        String espacio = " ";
        adevolver =  fecha.obtenerFecha()+ espacio + horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        return adevolver;
    }
    
    public void avanzar(){
        minutos.increment();
        fecha.avanzarFecha();
        if (minutos.getValue() == 0  ){
            horas.increment();
        }
        
        
    }
    
    public void fijarFechaYHora(int dia, int mes, int ano, int ahoras, int aminutos){
        fecha.fijarFecha(dia, mes, ano);
        horas.setValue(ahoras);
        minutos.setValue(aminutos);
        
    }
}
