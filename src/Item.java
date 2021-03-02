

public class Item {
    
    private int id;
    public String descripcion ;
    private Empleado responsable_item;
    enum prioridad  {BAJA, MEDIA, ALTA }
//    private Estado estado_actual;     // definir ESTADO
    private Fecha fecha_limite ;
    private Historial historial ;
//    private TipoItem tipo;            //Definir TIPO ITEM. GETTER Y SETTER, Y CONSTRUCTOR
    
    public Item() {
    }
    
    public Item(int id, String descripcion, Empleado responsable_item, Fecha fecha_limite) {
        this.id = id; 
        this.descripcion = descripcion;
        this.responsable_item = responsable_item; // null??
        this.fecha_limite = fecha_limite;
        this.historial = new Historial ();
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
