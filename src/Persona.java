

public abstract class Persona {  
    
    protected int DNI;
    protected String Apellido,Nombre;
    
    public Persona(String nombre,String apellido, int documento){
      this.DNI = documento;
      this.Apellido = apellido;
      this.Nombre = nombre;
    }
    
    public String getNombre(){
     
      return Nombre;
    }

    @Override
    public String toString() {
        return "Persona: " + "DNI=" + DNI + ", Nombre=" + Nombre;
    }
    
    
}
