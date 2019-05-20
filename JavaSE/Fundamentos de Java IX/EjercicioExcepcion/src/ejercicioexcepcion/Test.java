
package ejercicioexcepcion;

public class Test {
    int[] enteros;
    
    public Test (int tamano) {
        enteros = new int[tamano];
    }
    public void anadir(int indice, int valor){
        enteros[indice] = valor;
    }
}
