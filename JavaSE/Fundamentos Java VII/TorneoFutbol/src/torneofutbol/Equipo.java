package torneofutbol;

/**
 *
 * @author java
 */
public class Equipo implements Comparable{
    private final String nombreEquipo;
    private Jugador[] jugadores;
    private int totalGoles;

    public Equipo(String nombreEquipo, Jugador[] jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
    }

    public int getTotalGoles() {
        return totalGoles;
    }

    public void setTotalGoles(int totalGoles) {
        this.totalGoles = totalGoles;
    }

    public void incTotalGoles(int goles) {
        this.setTotalGoles(this.getTotalGoles() + goles);
    }

    
    /*
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    */
    
    

    public String getNombreEquipo() {
        return nombreEquipo;
    }
    
    

   /*
    / Comentando esta línea se hace inmutable
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    */

    public Jugador[] getJugadores() {
        return jugadores;
    }

    @Override
    public int compareTo(Object equipoComparado) {
        int retorno=-1;
        if(this.getTotalGoles()<  ( (Equipo) equipoComparado).getTotalGoles())  {
            retorno = 1;
        }
        return retorno;
    }
    
}
