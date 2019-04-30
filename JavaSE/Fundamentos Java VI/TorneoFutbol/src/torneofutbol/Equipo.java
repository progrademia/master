package torneofutbol;

/**
 *
 * @author java
 */
public class Equipo {
    private final String nombreEquipo;
    private Jugador[] jugadores;

    public Equipo(String nombreEquipo, Jugador[] jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
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
    
}
