/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author Contreras Puig Cesar Sachiro
 */
public class Marca extends Coche{

    private int carga;
    private String modelo;
    private String dueño;
    //Ejemplo de sobreescritura de constructores

    public Marca(String modelo) {
        this.modelo = modelo;
        this.dueño = dueño;
    }

    public Marca(String modelo, String dueño) {
        
        this.modelo = modelo;
        this.dueño=dueño;
    }

    Marca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    // Getters y Setters
     public void setDueño(String e)
     {
        dueño = e;
     }

     public String getDueño()
     {
        return dueño;
     }
    
      public void setModelo(String m)
     {
        modelo = m;
     }

     public String getModelo()
     {
        return modelo;
        
     }
     
      
    //Ejemplo de sobreescritura de método abstracto
    
    @Override
    public void comprar(String dueño) {
        this.setDueño(dueño);
        System.out.println(dueño + " compro el auto");
    }
    
    
    }

    
     


 
    
     

   
    
    
    

