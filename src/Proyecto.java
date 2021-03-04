/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;


public class Proyecto {
    
    private static int id = 1 ;
    private int id_proyecto;
    public Empleado lider;
    private HashSet <Item> items;
    
    
    public Proyecto() {
        this.id_proyecto = id;
        id++;
        this.lider = null; 
        this.items = new HashSet () ;  // Coleccion vacia.
    } 
    
    public Proyecto (Empleado lid) {
        this.id_proyecto = id;
        id++;
        this.lider = lid; // Inicializa con un lider ya asignado.
        this.items = new HashSet () ;  // Coleccion vacia.        
    }
    
    public void asignar_lider (Empleado d) {
       this.lider = d ;      
   }
   
   //IMPRIME TODOS LOS ITEMS EN EL PROYECTO.
   public void mostrar_items () {     
       
       for (Item i : this.items) {
        System.out.println (i); 
       }
   }
   
    public void crearItem (String descripcion, Tipo_Item tipo_item, Empleado responsable,Fecha fecha_limite, Equipo e ){
             
       Item i = new Item(descripcion, tipo_item, responsable, fecha_limite, e);
       this.items.add(i);            
   }
   



   
   
   ///////////////////////////////
   /// GETTERS, SETTER, EQUALS, HASHCODE toString ///////////
   //////////////////////////////
   
    public int getId() {
        return id;
    }

    public Empleado getLider() {
        return lider;
    }

    public HashSet getItems() {
        return items;
    }



    public void setLider(Lider_Proyecto lider) {
        this.lider = lider;
    }

    public void setItems(HashSet items) {
        this.items = items;
    }
    
    // Hash por ID de Proyecto.
    @Override
    public int hashCode() {   
        return this.id;
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
        final Proyecto other = (Proyecto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (this.lider== null) {
            return ("Proyecto{" + " id del proyecto= " + id + ", lider= No asignado. }");
        }
        else {
            return "Proyecto{" + " id del proyecto= " + id + ", lider= " + lider + '}';
        }
        
    }
    
    
    
   
            
            
            
            
   
    
}
