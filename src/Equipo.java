import java.util.HashSet;

public class Equipo {
    
    public static int id = 1 ; 
// La variable se aumenta cuando se agrega el equipo creado correctamente a la coleccion.
    private int id_equipo ;
    private HashSet <Desarrollador> equipo_desarrolladores ;
 
    
    

    public Equipo() {
        this.id_equipo=this.id ;
        this.equipo_desarrolladores = new HashSet ();
        
    }
    
    public String agregar_desarrollador (Desarrollador e) {
        if (this.equipo_desarrolladores.contains(e.getLegajo())){
            return "El empleado ya esta en el equipo." ;
        } else {
            this.equipo_desarrolladores.add(e) ;
            return "Empleado agregado.";
    
        }     
    }
    
    public String sacar_desarrollador (Desarrollador e) {
        if (this.equipo_desarrolladores.contains(e.getLegajo())){
            this.equipo_desarrolladores.remove(e) ;
            return "Empleado removido.";         
        } else 
            return "El empleado no esta en el equipo." ;
    
    }
    
    
    // BUSCA Y RETORNA EL EMPLEADO, POR LEGAJO.   
    // VALIDAR SI ES NULO, CADA VEZ QUE SE USE.
    public Desarrollador buscar_desarrollador (int legajo_buscado) {  
                  
        for (Desarrollador desarrollador : equipo_desarrolladores) {      
            if (legajo_buscado == desarrollador.getLegajo()){
                return desarrollador ;
            }
        }   
       System.out.println("Empleado no encontrado.");
       return null;       
    }    
    
    
    public void mostrar_equipo (Equipo e) {
        
        for (Desarrollador d : this.equipo_desarrolladores) {
            System.out.println(d);
        
        }
    }
    
    
    
    
    //////////////// GETTERS, SETTERS, HASHCODE, EQUALS, toString ///////////////////////
    
    public void setEquipo_desarrolladores(HashSet equipo_desarrolladores) {
        this.equipo_desarrolladores = equipo_desarrolladores;
    }

    public HashSet getEquipo_desarrolladores() {
        return equipo_desarrolladores;
    }
    
    
    public int getId_equipo() {
        return id_equipo;
    }

  
    // HASH CODE POR ID DE EQUIPO.
    @Override
    public int hashCode() {
           
        return this.id_equipo;
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
        final Equipo other = (Equipo) obj;
        if (this.id_equipo != other.id_equipo) {
            return false;
        }
        return true;
    }

    
   
    @Override
    public String toString() {
        String desarrolladores = "";
        for (Desarrollador e :equipo_desarrolladores){
        desarrolladores= desarrolladores + ", " + e;
        }
        return "Equipo{" + "id_equipo=" + id_equipo + ", equipo_desarrolladores=" + desarrolladores + '}';
        
    }

    
    
    
}
