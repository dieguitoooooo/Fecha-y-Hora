
/**
 * Write a description of class FechayHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechayHora
{
    // instance variables - replace the example below with your own
    private CalendarioBasico dia;
    private ClockDisplay hora;

    /**
     * Constructor for objects of class FechayHora
     */
    public FechayHora()
    {
        // initialise instance variables
        dia = new CalendarioBasico();
        hora = new ClockDisplay();
        dia.obtenerFecha();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getFechayHora()
    {
        // put your code here
        return dia.obtenerFecha() + " " + hora.getTime();  
    }
    
    public void avanzar()
    {
        hora.timeTick();
        if(hora.getTime().equals("00:00"))
        {
            dia.avanzarFecha();
        }
    }
    
    public void fijarFechaYHora(int dd, int mm, int aaaa, int hr, int min)
    {
        dia.fijarFecha(dd,mm,aaaa);
        hora.setTime(hr,min);
    }
}
