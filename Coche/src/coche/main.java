/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author Contreras Puig César Sachiro
 */
public class main {

    /**
     * @param args the command line arguments
     */
     void imprimeCoche(Coche gas)
   {
     //   usr.nombre equivale en este caso a usr.getNombre()
     System.out.println("\nNombre: " + gas.getDueño() );
       System.out.println("Modelo: "+ gas.getModelo());
  

   }
    public static void main(String[] args) {
        
        
        main prog = new main();
        
        Marca m1, m2;
        
        m1 = new Marca ("Neon");
       prog.imprimeCoche(m1);
    
       m2=new Marca("Attitude", "Cesar");
       prog.imprimeCoche(m2); 
    }
     
    private void comprar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
