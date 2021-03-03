/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pity_
 */

public abstract class Empleado extends Persona {
    
    private int legajo;
    
   public Empleado(String nombre,String apellido, int documento){
      super(nombre,apellido,documento);
    }
    
   // AGREGAR LEGAJO A CONSTRUCTOR.
/*
    public Empleado(int legajo) {
        this.legajo = legajo;
        
    }
 */  
   
   
    //Sin setter.
    public int getLegajo() {
        return legajo;
    }
    
    
    
}
