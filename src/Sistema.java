
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
    }
    
    public static Sistema getInstance(){
        
        if (instanciaSistema == null){
            instanciaSistema = new Sistema();
        }
        return instanciaSistema;
    }  
    
    
    // METODOS PROYECTO:
    
    
    public void crear_proyecto (Empleado responsable) {
        Proyecto proyecto_nuevo = new Proyecto (responsable) ;
        this.agregar_proyecto(proyecto_nuevo);
        
    }
            
    public Proyecto buscar_proyecto (int id) {
        for (Proyecto proyectoAux : this.proyectos_existentes) {      
            if (id == proyectoAux.getId()){
                return proyectoAux ;
            }  
        }      
    return null;
    }
    
    public void agregar_proyecto (Proyecto proyectoaux) {
        if (this.proyectos_existentes.contains(proyectoaux)){
            System.out.println("El Proyecto ya existe.");
        }else {
        this.proyectos_existentes.add(proyectoaux) ;  
        }
    }

    public void ver_Proyecto() {
        
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
            else {
                System.out.println("Equipo no encontrado");
            }
        }
        return null;
    }
    
    public void agregar_equipo (Equipo e) {
        if (this.equipos_existentes.contains(e)){
            System.out.println("El Equipo ya existe.");
        }else {
        this.equipos_existentes.add(e) ;  
        }
    }
    
    public void ver_Equipo () {
        
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
            if (e.getNombre().equals(nombre)) {
                return (e);
            }
            else {
                System.out.println("Tipo de item no encontrado");
            }
        }
        return null;
    }
    
    public void agregar_tipoItem (Tipo_Item e) {
        if (this.tipoItems_existentes.contains(e)){
            System.out.println("El Tipo de Item ya existe.");
        }else {
        this.tipoItems_existentes.add(e) ;  
        }
    }

    public void ver_tipoItems () {
        
        for (Tipo_Item i : this.tipoItems_existentes) {
            System.out.println(i);
        }
    
    }
    
    
    
    
    public void reportarItem (int id_proyecto, String descripcion,Tipo_Item tipo, int legajo_responsable,Fecha fechalim,int id_equipo ) {      
        // VERIFICACION DE DATOS
        
        //FALTA VERIFICAR TIPO DE ITEM.
        Proyecto proyectoAux=this.buscar_proyecto(id_proyecto);
        if (!(proyectoAux==null)) {
            Empleado empleado = Empleado.buscar_empleado(legajo_responsable) ;
            if (!(empleado == null)) {
                Equipo equipo = this.buscar_equipo(id_equipo) ;
                if (! (equipo == null)){                  
                    System.out.println("Datos correctos.");
                    proyectoAux.crearItem(descripcion, tipo, empleado, fechalim, equipo);
                }
            }          
        } else {
            System.out.println("Proyecto no encontrado.");  
            // crear proyecto si no existe??
        }
    }     
    
}
