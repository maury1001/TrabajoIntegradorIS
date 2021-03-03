
public class Lider_Proyecto extends Empleado {

    public Lider_Proyecto(String nombre, String apellido, int documento, int legajo) {
        super(nombre, apellido, documento);
        super.setLegajo(legajo);
    }

  
    public String ver_equipo (Equipo e) {  
        return e.toString() ;
    }
    

}
