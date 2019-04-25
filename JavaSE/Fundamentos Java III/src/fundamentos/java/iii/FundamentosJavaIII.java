/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.java.iii;

/**
 *
 * @author java
 */
public class FundamentosJavaIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //  byte short int long
     
     Movil nokia=new Movil();
     
        System.out.println(nokia.obtIMEI());
    
        
       
        
    }
    
}


class Movil{
    int size;
    
   double price;
   
   int almCap;
   
   int IMEI=142536;
   
   
   public Movil(){
       
   }
   
   
   
   public void encender(){
       
   }
   
   public String msgBienvenida(){
       
       
       return "";
   }
   
   public void apagar(){
       
       
       
       
   }
   
   public int obtIMEI(){
       
       
       
     return IMEI;  
   }
   
    
    
    
    
}
