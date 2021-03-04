
import java.util.HashSet;

public class Sistema {
    
    
    private static Sistema instanciaSistema = null;
    private HashSet <Proyecto> proyectos_existentes = null ;
    private HashSet <Equipo> equipos_existentes = null;
   
    private Sistema(){
        //INSTANCIA LAS COLECCIONES VACIAS.
        this.equipos_existentes= new HashSet ();
        this.proyectos_existentes = new HashSet ();      
    }
    
    public static Sistema getInstance(){
        
        if (instanciaSistema == null){
            instanciaSistema = new Sistema();
        }
        return instanciaSistema;
    }  
    
    
    // METODOS PROYECTO:
     // Hacer lo mismo para equipos.
    
    public void crear_proyecto (Empleado responsable) {
        Proyecto proyecto_nuevo = new Proyecto (responsable) ;
        this.proyectos_existentes.add(proyecto_nuevo); 
        
    }
    public void reportarItem (int id_proyecto, String descripcion,Tipo_Item tipo, Empleado responsable,Fecha fechalim,Equipo equipo ) {
        
        Proyecto proyectoAux=this.buscar_proyecto(id_proyecto);
        if (proyectoAux==null) {
            System.out.println("Proyecto no encontrado.");
            } else {
            proyectoAux.crearItem(descripcion, tipo, responsable, fechalim, equipo);
        }
        // buscar equipo y legajo de responsable, luego crear el item  
    }        

    // PREGUNTAR SI ES NULO.
    public Proyecto buscar_proyecto (int id) {
        for (Proyecto proyectoAux : this.proyectos_existentes) {      
            if (id == proyectoAux.getId()){
                return proyectoAux ;
            }  
        }      
        return null;        
   
}
    
    
}
