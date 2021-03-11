
import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
    
    
    private static Sistema instanciaSistema = null;
    private HashSet <Proyecto> proyectos_existentes = null ;
    private HashSet <Equipo> equipos_existentes = null;
    private HashSet <Tipo_Item> tipoItems_existentes = null;
    
   
    private Sistema(){
        //INSTANCIA LAS COLECCIONES VACIAS.
        this.equipos_existentes= new HashSet ();
        this.proyectos_existentes = new HashSet (); 
        this.tipoItems_existentes = new HashSet ();
       // Llama al metodo para iniciar el frame loggin de usuario.
        this.mostrarPantalla();
    }
    
    public static Sistema getInstance(){
        
        if (instanciaSistema == null){
            instanciaSistema = new Sistema();
        }
        return instanciaSistema;
    }  
    
    public void mostrarPantalla () {
        FrameLogin e = new FrameLogin ();
        e.setVisible(true);
    }
    
    
    
    
    // METODOS PROYECTO:
    
    public void crear_proyecto (Usuario user, String nombre) {
        Proyecto proyecto_nuevo = new Proyecto (user,nombre) ;
        this.agregar_proyecto(proyecto_nuevo);
        // Asignar Lider? puede ser otro dialog.
        
    }
            
    public Proyecto buscar_proyecto (String nombreBuscado) {
        // Variable
        for (Proyecto proyectoAux : this.proyectos_existentes) { 
            if (nombreBuscado.equals(proyectoAux.getNombre())){
                return proyectoAux ;
            }  
        }  
    System.out.println("No se encontro el proyecto.");    
    return null;
    }
    
    public ArrayList <Proyecto> buscar_proyecto_porUsuario (Usuario user) {
        ArrayList <Proyecto> arrayAux = new ArrayList();
        for (Proyecto i : this.proyectos_existentes) {
            if (user.getNombreUsuario().equals(i.getUsuario().getNombreUsuario())) {
               arrayAux.add(i);
            }
        }
        return arrayAux;
    }
    
    private void agregar_proyecto (Proyecto proyectoaux) {
       if (!(this.proyectos_existentes.contains(proyectoaux))){
           this.proyectos_existentes.add(proyectoaux) ; 
           Proyecto.id++;
           // Se Aumenta el id de clase proyecto.
        }
    }

    public void ver_Proyectos() {
        
        for (Proyecto i : this.proyectos_existentes) {
            System.out.println(i);
        }
    }    
    
    
    // METODOS EQUIPOS:
    
    public void crear_equipo () {
        Equipo e = new Equipo ();
        this.agregar_equipo(e);
    }
    
    public Equipo buscar_equipo (int id) {
        for (Equipo e : this.equipos_existentes) {
            if (e.getId_equipo()== id) {
                return (e);
            }
        }
        System.out.println("Equipo no encontrado");
        return null;
    }
    
    public void agregar_equipo (Equipo e) {
        if (this.equipos_existentes.contains(e)){
            System.out.println("El Equipo ya existe.");
        }else {
        this.equipos_existentes.add(e) ;
        Equipo.id++;
        // aumenta el id de clase equipo.
        }
    }
    
    public void ver_Equipos () {
        
        for (Equipo i : this.equipos_existentes) {
            System.out.println(i);
        }
    
    }    
    
    
    // METODOS TIPO_ITEMS

    public void crear_TipoItem (String s) {
        Tipo_Item e = new Tipo_Item (s);
        this.agregar_tipoItem(e);
    }
    
    public Tipo_Item buscar_tipoItem (String nombre) {
        for (Tipo_Item e : this.tipoItems_existentes) {
            if (e.getNombre().equals(nombre)) 
                return (e);
        }
        System.out.println("No se ecnontro el tipo de item.");
        return null;
    }
    
    public void agregar_tipoItem (Tipo_Item e) {
        if (this.tipoItems_existentes.contains(e)){
            System.out.println("El Tipo de Item ya existe.");
        }else {
        this.tipoItems_existentes.add(e) ;  
        //Se aumenta la variable estatica de tipo_item
        Tipo_Item.cantTipo++;
        
        }
    }

    public void ver_tipoItems () {
        
        for (Tipo_Item i : this.tipoItems_existentes) {
            System.out.println(i);
        }
    
    }
    
    //METODO CREAR CON PARAMETROS NECESARIOS.
    public void reportarItem (Proyecto proyectoSeleccionado,String descripcion, Tipo_Item ti) {
        // Proyecto nunca es nulo porque se mando desde el combo box.""
            if (this.tipoItems_existentes.contains(ti)){
                proyectoSeleccionado.crearItem(descripcion, ti);
                  
            }else {
                System.out.println("Tipo de item no existe");             
                }
    }
 
    
    // METODO CREAR CON TODOS SUS PARAMETROS. 
    
 /*   public void reportarItem2 (int id_proyecto, String descripcion,Tipo_Item tipo, int legajo_responsable,Fecha fechalim,int id_equipo ) {      
        // VERIFICACION DE DATOS
        
        //FALTA VERIFICAR TIPO DE ITEM.
        Proyecto proyectoAux=this.buscar_proyecto(id_proyecto);
        if (!(proyectoAux==null)) {
            if (this.tipoItems_existentes.contains(tipo)){
                Empleado empleado = Empleado.buscar_empleado(legajo_responsable) ;
                if (!(empleado == null)) {
                    Equipo equipo = this.buscar_equipo(id_equipo) ;
                    if (! (equipo == null)){                  
                        System.out.println("Datos correctos.");
                        proyectoAux.crearItem2(descripcion, tipo, empleado, fechalim, equipo);
                    }
                }          
            } else {
                System.out.println("Tipo de item no existe");  
                // crear tipo de item??
                }
        } else {
            System.out.println("Proyecto no encontrado");
            // crear proyecto si no existe??
            }
    }     
*/
    
    public HashSet<Tipo_Item> getTipoItems_existentes() {
        return tipoItems_existentes;
    }

    public HashSet<Proyecto> getProyectos_existentes() {
        return proyectos_existentes;
    }
    
}
