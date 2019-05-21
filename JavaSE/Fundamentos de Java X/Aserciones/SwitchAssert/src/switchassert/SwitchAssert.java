
package switchassert;

/**
 *
 * @author java
 */
public class SwitchAssert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int estadoMotor = 56;
        
        switch (estadoMotor) {
            case 1:
                System.out.println("El motor está encendido.");
                break;
            case 2:
                System.out.println("El motor está apagado.");
                break;
            default:
                assert false: "El motor está averiado.";
        }
    }
    
}
