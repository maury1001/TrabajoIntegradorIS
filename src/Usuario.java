
public class Usuario extends Persona{
   
    private static int ID;
    private String nombreUsuario, contraseña;
    
    
    public Usuario(String nombre,String apellido, int documento,String usuario,String contraseña){
      super(nombre,apellido,documento);
      this.nombreUsuario = usuario;
      this.contraseña = contraseña;
      
    }
    
    
    public void introducirUsuario(){}
    public void introducirContraseña(){}
    public void solicitarNuevoItem(){}
    
    
    public String obtenerContraseña(){
      return this.contraseña;
    }
    
}
