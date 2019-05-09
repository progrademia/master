package torneofutbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import utilidades.JugadoresBaseDatos;

public class Torneo {

    private String nombreTorneo;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* 
        dbj.jugadores.forEach(jugador -> System.out.println(jugador.getNombreJugador()));
        System.exit(0);
        */
        Torneo torneo = new Torneo("Liga Java");
        Equipo[] equipos = torneo.crearEquipos("Java,Duke,Carlos,Angel,Francisco", 2);
        Partido[] partidos = torneo.crearPartidos(equipos);
        for(Partido partidoActual: partidos){
           partidoActual.jugar();
            System.out.println(partidoActual);
        }
        
        torneo.mostrarMejorEquipo(equipos);
        //Equipo e = new Equipo("Equipo A");
        //System.out.println(e.getNombreEquipo());
    }

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }
    
    public void mostrarMejorEquipo(Equipo[] equipos){
        Arrays.sort(equipos);
        System.out.println("\n Clasificación");
        for(Equipo equipoActual: equipos){
            System.out.println(
                        equipoActual.getNombreEquipo()+ ":"+
                        equipoActual.getTotalGoles()        
                    
                    );
        }
        
    }
    
    
    public Equipo[] crearEquipos(String nombresEquipos, int numJugadores){
        
        JugadoresBaseDatos jugadoresDB = new JugadoresBaseDatos();
        
        StringTokenizer cadenaXToken = new StringTokenizer(nombresEquipos, ",");
        Equipo[] misEquipos = new Equipo[cadenaXToken.countTokens()];
        
        for (int i = 0; i < misEquipos.length ; i++) {
            /*Jugador[] jugadores = new Jugador[numJugadores];
            for (int j = 0; j < jugadores.length; j++) {
                jugadores[j] = new Jugador("Nombre Jugador");
                
            }*/
            //misEquipos[i] = new Equipo(cadenaXToken.nextToken(), jugadores);
            misEquipos[i] = new Equipo(cadenaXToken.nextToken(), jugadoresDB.getEquipo(numJugadores));            
           // System.out.println(misEquipos[i].getNombreEquipo());
            
        }
        
        return misEquipos;
    }

   public Partido[] crearPartidos(Equipo[] equipos){
       
       ArrayList misPartidos = new ArrayList();
       for(Equipo equipoLocal:equipos){
            for(Equipo equipoVisitante:equipos){
                if(! equipoLocal.equals(equipoVisitante)){
                    misPartidos.add(new Partido(equipoLocal, equipoVisitante));
                }
            }
       }
       
       
       return (Partido[]) misPartidos.toArray(new Partido[1]);
   }
    
    
    
}
