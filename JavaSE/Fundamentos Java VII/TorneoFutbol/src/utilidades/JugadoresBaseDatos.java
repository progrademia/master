package utilidades;

import java.util.ArrayList;
import java.util.StringTokenizer;
import torneofutbol.Jugador;

/**
 *
 * @author java
 */
public class JugadoresBaseDatos {
    
    String listaJugadores =
            "Jugador 01," +
            "Jugador 02," +
            "Jugador 03," +
            "Jugador 04," +
            "Jugador 05," +
            "Jugador 06," +
            "Jugador 07," +
            "Jugador 08," +
            "Jugador 09," +
            "Jugador 10";
    
    private ArrayList<Jugador> jugadores;
    
    public JugadoresBaseDatos() {
        StringTokenizer jugadorTokens = new StringTokenizer(listaJugadores,",");
        jugadores = new ArrayList<>();
        while(jugadorTokens.hasMoreTokens()){
             jugadores.add(new Jugador(jugadorTokens.nextToken()));
        }
    }
    
    public Jugador[] getEquipo(int numJugadores){
        
        Jugador[] jugadoresList = new Jugador[numJugadores];
        
        for(int i = 0; i<numJugadores; i++){
            int indiceJugBorrar= (int)  ( Math.random() * jugadores.size() ) ;
            jugadoresList[i] = jugadores.get(indiceJugBorrar);
            jugadores.remove(indiceJugBorrar);
            
        }
        return jugadoresList;
    }
    
    
    
    
}
