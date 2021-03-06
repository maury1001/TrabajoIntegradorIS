
import java.util.HashMap;
import javax.swing.JOptionPane;



public class LoginUsuario {
    
     private static HashMap<String, Usuario> usuariosSistema = null;
     private static Usuario usuarioValidado = null;
     

    public static Usuario inicioSesion(){
         if(usuariosSistema == null){
          usuariosSistema = new HashMap<String, Usuario>();
      }
        String usuario = JOptionPane.showInputDialog("Introducir Usuario");
        String contraseña;
        
        boolean flag = false;
        

        
       usuarioValidado = usuariosSistema.get(usuario);
      
       if (!(usuarioValidado == null)){
         contraseña = JOptionPane.showInputDialog("Introducir Contraseña");
              if(contraseña.equals(usuarioValidado.obtenerContraseña())){
                  flag = true;
                  System.out.println("Usuario Valido");
              }else{
                  System.out.println("Contraseña Invalida");} 
       }else{
         System.out.println("El usuario no existe");
       }
       
       if (flag == true){ 
       return usuarioValidado;
       }            
       return null;
       
    } 
    
    
    public static void registroUsuario(){
        
 
        String nombre = JOptionPane.showInputDialog("Introducir nombre");
        String apellido = JOptionPane.showInputDialog("Introducir apellido");
        int documento = Integer.parseInt(JOptionPane.showInputDialog("Introducir documento"));
        String usuario = JOptionPane.showInputDialog("Introducir usuario");
        String contraseña = JOptionPane.showInputDialog("Introducir contraseña");
        
        
        Usuario usuarioNuevo = new Usuario(nombre,apellido,documento,usuario,contraseña);
      
      if(usuariosSistema == null){
          usuariosSistema = new HashMap<String, Usuario>();
      }
      
      usuariosSistema.put(usuario, usuarioNuevo);
    
    
    }
   
    
    
    
    
  
}







            
 