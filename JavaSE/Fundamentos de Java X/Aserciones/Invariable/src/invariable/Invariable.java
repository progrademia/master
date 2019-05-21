
package invariable;

/**
 *
 * @author java
 */
public class Invariable {

    /**
     * @param args the command line arguments
     */
    
    // Dos formas de declarar assert:
    // assert Exprisón;
    // assert Expresión: expresión
    // java -enableassertions Programa;
    // java -ea Programa;
    static void comprobar(int numero) {
        int x = numero;
        if (x > 0) {
            System.out.println("El número es positivo.");
        } else if (x == 0) {
            System.out.println("El número es cero");
        } else {
            assert (x > 0);
        }
    }
    
    public static void main(String[] args) {
        comprobar(-1);
    }
    
}
