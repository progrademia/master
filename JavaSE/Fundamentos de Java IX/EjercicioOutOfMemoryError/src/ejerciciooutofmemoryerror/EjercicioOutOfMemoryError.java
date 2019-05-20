
package ejerciciooutofmemoryerror;

import java.util.ArrayList;


public class EjercicioOutOfMemoryError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        while (true){
            String cadena = "Vamos a causar un error";
            lista.add(cadena);
            long tamano = lista.size();
            if (tamano % 1000000 == 0) {
                System.out.println("La lista contiene " + 
                        tamano/1000000 + "millones de elementos");
            }
        }
    }
    
}
