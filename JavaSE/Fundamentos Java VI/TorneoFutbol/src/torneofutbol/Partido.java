package torneofutbol;

/**
 *
 * @author java
 */
public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String resultado;

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
       resultado = equipoLocal.getNombreEquipo() + " (" +   (int) (Math.random()*5)     + "-"+ (int) (Math.random()*4)    + " ) "+equipoVisitante.getNombreEquipo();
    }

    @Override
    public String toString() {
        return resultado;
    }
    
    
    
    
}
