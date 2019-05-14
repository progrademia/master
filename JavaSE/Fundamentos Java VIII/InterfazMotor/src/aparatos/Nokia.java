
package aparatos;

import interfaces.EntradaSalida;


public class Nokia implements EntradaSalida{

    @Override
    public void Conectar() {
        System.out.println("Nokia conectando.");
    }

    @Override
    public void Lectura() {
        System.out.println("Leyendo datos.....");
    }

    @Override
    public void Desconectar() {
        System.out.println("Nokia desconectado.");
    }
    
}
