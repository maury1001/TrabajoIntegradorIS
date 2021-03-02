
import java.util.Collection;
import java.util.HashSet;


public class Proyecto {
    
    private int id ;
    public Empleado lider;
    private HashSet items;
    
    public Proyecto(int id) {
        this.id = id;
    //    this.lider = new Lider_Proyecto(); // ??? crear uno en blanco? o nulo
        this.items = new HashSet () ;  // Coleccion vacia.
    }
    
    
    
  // public void asignar_lider (Desarrollador d) {
  //     this.lider = d ;
       
  // }
   
   public void mostrar_items () {
       //IMPRIME TODOS LOS ITEMS EN EL PROYECTO.
       this.items.toString();
   }
   
    public void asignar_equipo (Item i, Equipo e) {
        
        //COMPLETAR
    
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

    public void setLider(Empleado lider) {
        this.lider = lider;
    }

    public void setItems(HashSet items) {
        this.items = items;
    }

   
            
            
            
            
   
    
}
