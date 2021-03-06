
import java.util.ArrayList;

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
    
    private static int cantEmpleados = 1;
    private int legajo;
    // ARRAY CONTIENE TODOS LOS OBJETOS CREADOS, NO REPETIDOS.
    private static ArrayList <Empleado> empleados = new ArrayList () ;
   
    

    public Empleado(String nombre, String apellido, int documento) {
        super (nombre,apellido,documento) ;       
        this.legajo = cantEmpleados;    
        this.agregar_empleado(this);
    }
    

    
    public void agregar_empleado (Empleado e) {
        if (Empleado.empleados.contains(e)){
            System.out.println("El empleado ya existe.");
        }else {
         Empleado.empleados.add(e) ; 
         // Se aumenta la variable estatica.
         cantEmpleados++;
        }
    }
    
    public static Empleado buscar_empleado (int id) {     
        for (Empleado e : Empleado.empleados) {
            if (e.getLegajo()== id) {
                return (e);
            }
            else {
                System.out.println("Empleado no encontrado");
            }
        }
        return null;       
    } 
    
    public static void ver_Empleados (){
        for (Empleado i : Empleado.empleados) {
            System.out.println(i);
        }
    }
    
    
    public int getLegajo() {
        return legajo;
    }
    


    @Override
    public int hashCode() {
        return this.DNI;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        return true;
    }

    
    
    
    
    @Override
    public String toString () {
        return ("{ " + this.getNombre() + " Numero de Legajo: " + this.getLegajo()+ "}" );
    
    } 
    
    
    
}
