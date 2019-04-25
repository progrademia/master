/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjavaiv;

/**
 *
 * @author java
 */
public class Movil {
    
    
    public int precio;
    public int bateria;
    public String tipoPantalla;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }
    
    
    public  void setAtributos(int precio, int capBat, String pantalla){
        
        this.precio=precio;
        this.bateria=capBat;
        this.tipoPantalla=pantalla;
       
    
    }
    
   
    
    
    
    
    
    
}
