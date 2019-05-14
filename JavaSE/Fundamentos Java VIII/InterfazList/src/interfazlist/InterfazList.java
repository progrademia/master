
package interfazlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InterfazList {

    
    public static void main(String[] args) {
        
        String[] nombres = {"Paco", "Juan", "Lucas"};
        List<String> mi_arraylist = new ArrayList(Arrays.asList(nombres));
        
        System.out.println("Recorrer los nombres en mayúsculas: ");
        for(String s: mi_arraylist) {
            System.out.println(s.toUpperCase() + ", ");
        }
        
        System.out.println("Mostrar la lista: " + mi_arraylist);
        
        // Lambda
        mi_arraylist.replaceAll(s -> s.toUpperCase());
        System.out.println("Lista nueva: " + mi_arraylist);
        
    }
    
}
