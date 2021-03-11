import java.util.HashSet;
import java.util.Objects;


public class Proyecto {
    
    public static int id = 1 ;
    private int id_proyecto;
    public Empleado lider;
    private HashSet <Item> items;
    private String nombre;
    private Usuario usuario;
    
    
    public Proyecto(Usuario user, String nuevoNombre) {
        this.id_proyecto = id;  
        this.nombre=nuevoNombre;
        this.usuario=user;
        this.lider = null; 
        this.items = new HashSet () ;  // Coleccion vacia.
    } 
    
    public Proyecto (Usuario user,String nuevoNombre , Empleado lid ) {
        this.id_proyecto = id;
        this.usuario= user;
        this.nombre=nuevoNombre;
        this.lider = lid;
        this.items = new HashSet () ;  // Coleccion vacia. 
        // se puede filtrar los proyecto por Lider (acceso desde login.)
    }
    
    
 
   
   //IMPRIME TODOS LOS ITEMS EN EL PROYECTO.
   public void mostrar_items () {     
       
       for (Item i : this.items) {
        System.out.println (i); 
       }
    }
   
   /* public void crearItem2 (String descripcion, Tipo_Item tipo_item, Empleado responsable,Fecha fecha_limite, Equipo e ){
             
       Item i = new Item(descripcion, tipo_item, responsable, fecha_limite, e);
       this.items.add(i);            
   }   */
    
    public void crearItem (String descripcion, Tipo_Item tipo_item ){
             
       Item i = new Item(descripcion, tipo_item);
       this.items.add(i);  
       
     //  return i.getId_item();
    }    
   
    public void buscarItem (String s) {
        
    
    }



   
   
   
   /// GETTERS, SETTER, EQUALS, HASHCODE toString ///////////
   
    
    // Asignar lider
    public void setLider(Empleado lider) {
        this.lider = lider;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id_proyecto;
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
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        return hash;
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
       if (this.lider== null)  {
            return ("Proyecto:"+"Nombre= "+nombre + " id del proyecto= " + id_proyecto +", usuario: "+ usuario.getNombreUsuario()+ ", lider= No asignado.");
        }
        else {
        return "Proyecto: " + " nombre=" + nombre + " id del proyecto= " + id_proyecto + ", usuario: " + usuario.getNombreUsuario() + ", lider=" + lider ;
        }
    }
    




            
   
    
}
