
package lambda;

/**
 *
 * @author java
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] strList = {"coche", "coche", "cochero", "recochero", "recoche", "recochear", "pedroche"};
        
        Analizador analizadorObj = new Analizador();
        String buscarStr = "oche";
        System.out.println("Buscando: " + buscarStr);
        
        
        System.out.println("***Contiene***");
        analizadorObj.mostrarResultado(strList, buscarStr, 
                (t, s) -> t.contains(s));
        
        System.out.println("***Comienza con***");
        analizadorObj.mostrarResultado(strList, buscarStr, 
                (t, s) -> t.startsWith(s));
        
        System.out.println("***Igual***");
        analizadorObj.mostrarResultado(strList, buscarStr, 
                (t, s) -> t.equals(s));
        
        System.out.println("***Termina con***");
        analizadorObj.mostrarResultado(strList, buscarStr, 
                (t, s) -> t.endsWith(s));
       
    }
    
}
