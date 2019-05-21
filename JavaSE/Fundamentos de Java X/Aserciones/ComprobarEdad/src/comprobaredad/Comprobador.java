
package comprobaredad;

/**
 *
 * @author java
 */
public class Comprobador {
    public void comprobar(int edad) {
        assert edad >= 18 && edad < 150: "Está fuera del rango de ead";
    }
}
