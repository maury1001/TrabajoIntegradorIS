
public class Lider_Proyecto extends Empleado {

    public Lider_Proyecto(String nombre, String apellido, int documento) {
        super(nombre, apellido, documento);
    }

  
    public String ver_equipo (Equipo e) {  
        return e.toString() ;
    }
    

}
