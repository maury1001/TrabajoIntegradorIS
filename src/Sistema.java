public class Sistema {
    
    
    private static Sistema instanciaSistema = null;
    
    
    private Sistema(){}
    
    public static Sistema getInstance(){
        
        if (instanciaSistema == null){
            instanciaSistema = new Sistema();
        }
        return instanciaSistema;
    }
}
