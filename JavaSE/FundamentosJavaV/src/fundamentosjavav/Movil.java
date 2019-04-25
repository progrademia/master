/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjavav;

/**
 *
 * @author java
 */
public class Movil {
    
    private int precio;
    private String marca;
    private int capB;
    
    public Movil(){
        
    }
    
    public Movil(int precio){
        setPrecio(precio);
     
    }
    
    public Movil(int precio, String marca){
        this(precio);
        setMarca(marca);
    }
    
    public Movil(int precio, String marca, int capB){
        this(precio, marca);
        setCapB(capB);
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    private void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    private void setMarca(String marca) {
        if(marca.length()>2){
            
        this.marca = marca;
        
        }
    }

    /**
     * @return the capB
     */
    public int getCapB() {
        return capB;
    }

    /**
     * @param capB the capB to set
     */
    private void setCapB(int capB) {
        this.capB = capB;
    }
    
    
    
}
