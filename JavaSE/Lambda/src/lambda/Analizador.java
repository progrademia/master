
package lambda;

/**
 *
 * @author java
 */
public class Analizador {
    
    public void mostrarResultado(String[] strLista, String buscarStr, AnalizadorInterface analizador){
        for(String actualStr: strLista){
            if(analizador.analizador(actualStr, buscarStr)){
                System.out.println("Encontrado ----> " + actualStr);
            }
        }
    }
}
