/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pity_
 */
abstract class Empleado extends Persona {
    
    private int legajo;
    

    //Sin setter.

    public Empleado(String nombre, String apellido, int documento) {
        super (nombre,apellido,documento) ;
        
        
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    
    
    
}
