package torneofutbol;

import java.util.ArrayList;

/**
 *
 * @author java
 */
public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String resultado;
    private EventosJuego[] eventos;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }
    
    public void jugar(){
        ArrayList<EventosJuego> listaEventos = new ArrayList<>();
        EventosJuego eventoActual ;
        
        for (int i = 1; i <= 90; i++) {
            if (Math.random() > 0.8) {
                eventoActual =  (Math.random() > 0.8)  ?  new Gol() : new Posesion();
                eventoActual.setEquipo((Math.random() > 0.5)?equipoLocal:equipoVisitante);
                eventoActual.setJugador(eventoActual.getEquipo().getJugadores()[ 
                       (int) Math.random()* eventoActual.getEquipo().getJugadores().length
                        ]);
                eventoActual.setMomento(i);
                listaEventos.add(eventoActual);
                
            }
        }
        this.eventos = new EventosJuego[ listaEventos.size()  ];
        listaEventos.toArray(this.eventos);
        
        
       //resultado = equipoLocal.getNombreEquipo() + " (" +   (int) (Math.random()*5)     + "-"+ (int) (Math.random()*4)    + " ) "+equipoVisitante.getNombreEquipo();
    }

    @Override
    public String toString() {
        return resultado;
    }
    
    public String getPartido(){
        // Mostrar eventos del partido
        // Si es gol, incrementar goles totales del equipo.
        // Intentar añadir, ademas de goles, puntos a los partidos.
        
    }
    
    
    
    
}
