

public class Main {
    
    public static void main(String[] args) {
        
        Sistema sis = Sistema.getInstance();              
        

        sis.crear_equipo();
        
        Desarrollador des1= new Desarrollador ("Sebastian","Maritnez",40473279);
        Desarrollador des2= new Desarrollador ("Mauricio","Allaman",2);
        //Desarrollador des3= new Desarrollador ("Sebastian","Maritnez",40473279);
        
        Equipo e =sis.buscar_equipo(1);
        e.agregar_desarrollador(des1);
        e.agregar_desarrollador(des2);
        //e.agregar_desarrollador(des3);    
        
        sis.crear_TipoItem("Reporte de bug");
        sis.crear_TipoItem("Mejora de rendimiento");
       // sis.crear_TipoItem("reporte de bug");
        sis.crear_TipoItem("Modificacion");
   
        Tipo_Item ti= sis.buscar_tipoItem("Reporte de bug");
        Tipo_Item ti2= sis.buscar_tipoItem("Mejora de rendimiento");

        Usuario nuevoUsuario2 = new Usuario ("Carlos","Tevez",3333,"tevez","123");
        Usuario nuevoUsuario = new Usuario("Mauricio usuario","Allaman",35688716,"Admin","12345");
        FrameLogin.agregarUsuario(nuevoUsuario);
        FrameLogin.agregarUsuario(nuevoUsuario2);      
        
        sis.crear_proyecto(nuevoUsuario2, "Proyecto uno" );
        sis.crear_proyecto(nuevoUsuario, "Proyecto Umbrella");
        sis.crear_proyecto(nuevoUsuario, "Proyecto NinjaSport");
        
        
        Fecha f= new Fecha (30,03,2021);
        Proyecto p = sis.buscar_proyecto("Proyecto NinjaSport");
      //  p.crearItem2("Bug en el titulo", ti, des1, f, e);     
        sis.reportarItem(p, "mejora de software 2", ti2);
        p.crearItem("bug en funcionamiento", ti);
        p.crearItem("mejora de software", ti2);
        p.crearItem ("Bug en el titulo",ti);

    }
    
    
}
