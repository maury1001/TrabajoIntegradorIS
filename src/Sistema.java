
import javax.swing.JOptionPane;
import java.util.HashMap;

public class Sistema {
    
    
    private static Sistema instanciaSistema = null;
    private static HashMap<String, Usuario> usuariosSistema = null;
    
    private Sistema(){}
    
    public static Sistema getInstance(){
        
        if (instanciaSistema == null){
            instanciaSistema = new Sistema();
        }
        return instanciaSistema;
    }
    
    
    public static Usuario nuevoUsuario(String nombre,String apellido, int documento,String usuario,String contraseña){
       
      Usuario usuarioNuevo = new Usuario(nombre,apellido,documento,usuario,contraseña);
      
      if(usuariosSistema == null){
          usuariosSistema = new HashMap<String, Usuario>();
      }
      usuariosSistema.put(usuario, usuarioNuevo);

      return usuarioNuevo;
    }
    
    public static void validarUsuario(Usuario usuarioActivo){
        
        String usuario = JOptionPane.showInputDialog("Introducir Usuario");
        String contraseña;
        Usuario usuarioValidado = null;
        
        //chekear por hacer sin for 
      /*  for(String u:usuariosSistema.keySet()){
           
            if (usuario.equals(u)){
              usuarioValidado = usuariosSistema.get(usuario); 
              contraseña = JOptionPane.showInputDialog("Introducir Contraseña");
              if(contraseña.equals(usuarioValidado.obtenerContraseña())){
                  System.out.println("Usuario Valido");
              }else{
                  System.out.println("Contraseña Invalida");}
            }else{
                System.out.println("El usuario no existe");
            }     
        }*/
        
       usuarioValidado = usuariosSistema.get(usuario);
       if (!(usuarioValidado == null)){
         contraseña = JOptionPane.showInputDialog("Introducir Contraseña");
              if(contraseña.equals(usuarioValidado.obtenerContraseña())){
                  System.out.println("Usuario Valido");
              }else{
                  System.out.println("Contraseña Invalida");} 
       }else{
         System.out.println("El usuario no existe");
       }
    }
    
}
