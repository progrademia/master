
package aparatos;

import interfaces.EntradaSalida;


public class Samsung implements EntradaSalida{

    @Override
    public void Conectar() {
        System.out.println("Samsung conectando.");
    }

    @Override
    public void Lectura() {
        System.out.println("Leyendo datos.....");
    }

    @Override
    public void Desconectar() {
        System.out.println("Samsung desconectando.");
    }
    
}
