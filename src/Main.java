
public class Main {
    
    public static void main(String[] args) {
        
        Sistema.getInstance();
        
        Usuario usuarioNuevo =  Sistema.nuevoUsuario("Mauricio","Allaman",35688716,"amallaman","12345");
        
        
        
        Sistema.validarUsuario(usuarioNuevo);
        
        
    }
    
    
}
