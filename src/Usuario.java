
import java.util.Objects;


public class Usuario extends Persona{
   
    private static int ID;
    private String nombreUsuario, contraseña;
    
    
    public Usuario(String nombre,String apellido, int documento,String usuario,String contraseña){
      super(nombre,apellido,documento);
      this.nombreUsuario = usuario;
      this.contraseña = contraseña;
      
    }
    
    public String obtenerContraseña(){
      return this.contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombreUsuario);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        super.toString();
        return "Usuario: " + nombreUsuario ;
    }
    
    
    
    
    
}
