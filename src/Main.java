

public class Main {
    
    public static void main(String[] args) {
        
        Sistema sis = Sistema.getInstance();     
        
        sis.mostrarPantalla();             
        
        
     //   Usuario usuarioNuevo = LoginUsuario.inicioSesion();   
     //   LoginUsuario.registroUsuario();

     sis.crear_equipo();
        Desarrollador des1= new Desarrollador ("Sebastian","Maritnez",40473279);
        Desarrollador des2= new Desarrollador ("Mauricio","Allaman",2);
        Desarrollador des3= new Desarrollador ("Sebastian","Maritnez",40473279);
        
        Equipo e =sis.buscar_equipo(1);
        e.agregar_desarrollador(des1);
        e.agregar_desarrollador(des2);
        e.agregar_desarrollador(des3);

    
        System.out.println("EMPLEADOS CREADOS:");
        Empleado.ver_Empleados();
        
        System.out.println(" EQUIPOS CREADOS.");
        sis.ver_Equipos();
     
        
        System.out.println("EQUIPO 1 :");
        e.mostrar_equipo(e);
        
        
        sis.crear_TipoItem("reporte de bug");
        sis.crear_TipoItem("mejora de rendimiento");
        sis.crear_TipoItem("reporte de bug");
        sis.crear_TipoItem("reporte de bug2");
         System.out.println("paso 0");
        Tipo_Item ti= sis.buscar_tipoItem("reporte de bug");
        System.out.println(ti);
        Tipo_Item ti2= sis.buscar_tipoItem("mejora de rendimiento");
         System.out.println(ti2);
        sis.ver_tipoItems();
        
        
        Proyecto p = new Proyecto (des1);
        Fecha f= new Fecha (30,03,2021);
        p.crearItem2("Bug en el titulo", ti, des1, f, e);
        p.crearItem("bug en funcionamiento", ti);
        p.crearItem("mejora de software", ti2);
        p.mostrar_items();    
        
      
    }
    
    
}
