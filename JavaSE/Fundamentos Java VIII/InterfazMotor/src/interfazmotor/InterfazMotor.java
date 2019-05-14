
package interfazmotor;

import aparatos.Nokia;
import aparatos.Samsung;
import interfaces.EntradaSalida;
import java.util.Scanner;


public class InterfazMotor {


    public static void main(String[] args) {
        
        // Menú
        System.out.println("*** Menú principal ***");
        System.out.println("1 - Nokia");
        System.out.println("2 - Samsung");
        System.out.println("Seleccione un modelo ---> ");
        
        // Instanciamos EntradaSalida
        EntradaSalida aparato = null;
        
        int eleccion = -1;
        
        Scanner sc = new Scanner(System.in);
        switch(sc.nextInt()) {
            case 1:
                // Instanciamos aparato de la clase Nokia
                aparato = new Nokia();
                break;
            case 2:
                // Instanciamos aparato de la clase Samsung
                aparato = new Samsung();
                break;
            default:
                // Valor por defecto
                System.out.println("Valor incorrecto.");
                
            
        }
        
        if (aparato != null) {
                aparato.Conectar();
                aparato.Lectura();
                aparato.Desconectar();
                
        }
        
        
    }
    
}
