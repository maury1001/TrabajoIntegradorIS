/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Item {
    
    private static int id=1;
    private int id_item ;
    public String descripcion ;
    private Empleado responsable_item;
    enum prioridad  {BAJA, MEDIA, ALTA }
//    private Estado estado_actual;     // definir ESTADO
    private Fecha fecha_limite ;
    private Historial historial ;
//    private TipoItem tipo;            //Definir TIPO ITEM. GETTER Y SETTER, Y CONSTRUCTOR
    private Equipo equipo_asignado ;
    
    
    public Item (String descripcion, Empleado responsable_item, Fecha fecha_limite, Equipo e) {
        this.id_item = this.id; 
        this.id ++;
        this.descripcion = descripcion;
        this.responsable_item = responsable_item; // null??
        this.fecha_limite = fecha_limite;
        this.historial = new Historial ();
        this.equipo_asignado = e;
    }
    
    
    public String ver_equipo () {  
        return this.equipo_asignado.toString() ;
    }
    
    public void asignar_equipo (Equipo e) {
        this.equipo_asignado = e;
    }
    
    public void actualizarHistorial (String s) { // pedir estado actual y siguiente y hacer el string formato?
        this.historial.historial = (historial.getHistorial() + " " + s); // historial local pide el historial + un espacio + el string VALIDAR??  
    
    }
    
    public void ver_historial ( ) {
        System.out.println(this.historial); // hacer toString en CLASE Historial
        // ESTADO, RESONSABLE, FECHA.
    }
    
    public void asignar_responsable (Empleado e) {
       this.responsable_item = e;      
       // ACTUALIZAR HISTORIAL ??
    }
    
  /*  public String ver_estado_actual () {
        return this.Estado.estadoActual
        
        //FALTA IMPLEMENTAR ESTADO.
    }
    */
    
    /////////////////  GETTERS Y SETTERS  //////////////////////////////

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Empleado getResponsable_item() {
        return responsable_item;
    }

    public Fecha getFecha_limite() {
        return fecha_limite;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setResponsable_item(Empleado responsable_item) {
        this.responsable_item = responsable_item;
    }

    public void setFecha_limite(Fecha fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }


    
    
    
}
