/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Desarrollador extends Empleado {
    

    public Desarrollador(String nombre, String apellido, int documento, int legajo) {
        super(nombre, apellido, documento);
        super.setLegajo(legajo);
    }


    @Override
    public String toString () {
        
        return (this.getNombre() + " " + "Legajo Numero: " + this.getLegajo()) ;
    
    }
    
    
}
