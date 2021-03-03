/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;


public class Proyecto {
    
    private int id ;
    public Lider_Proyecto lider;
    private HashSet <Item> items;
    
    
    public Proyecto(int id) {
        this.id = id;
        this.lider = null; 
        this.items = new HashSet () ;  // Coleccion vacia.
    }
    
    public Proyecto (int id, Lider_Proyecto lid) {
        this.id = id;
        this.lider = lid; // Inicializa con un lider ya asignado.
        this.items = new HashSet () ;  // Coleccion vacia.        
    
    }
    
    
    
    
    
   public void asignar_lider (Lider_Proyecto d) {
       this.lider = d ;      
   }
   
   //IMPRIME TODOS LOS ITEMS EN EL PROYECTO.
   public void mostrar_items () {      
       System.out.println (this.items.toString()); // HACER.. recorrer estructura.
   }
   

   
   
   ///////////////////////////////
   /// GETTERS Y SETTER///////////
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

    public void setId(int id) {
        this.id = id;
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
    
    
   
            
            
            
            
   
    
}
