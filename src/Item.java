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
    private Tipo_Item tipo;            
    private Equipo equipo_asignado ;
    
    
    public Item (String descripcion, Tipo_Item tipo_item , Empleado responsable_item, Fecha fecha_limite, Equipo e) {
        this.id_item = this.id; 
        this.id ++;
        this.descripcion = descripcion;
        this.tipo= tipo_item ;
        this.responsable_item = responsable_item;
        this.fecha_limite = fecha_limite;
        this.historial = new Historial ();
        this.equipo_asignado = e;
    }
    
    public Item (String descripcion, Tipo_Item tipo_item) {
        this.id_item = this.id; 
        this.id ++;
        this.descripcion= descripcion;
        this.tipo=tipo_item ;
        this.responsable_item = null; // ASIGNAR RESPONSABLE
        this.fecha_limite = null; // METODO ESTABLECER FECHA.
        this.historial = new Historial ();
        this.equipo_asignado = null;  // ASIGNAR EQUIPO      
    }
    
    
    public String ver_equipo () {  
        return this.equipo_asignado.toString() ;
    }
    
    public void asignar_equipo (Equipo e) {
        this.equipo_asignado = e;
    }
    
    
    public void actualizarHistorial (Empleado responsable, Fecha fecha, String estado_actual) {
        this.historial.actualizarHistorial(responsable, fecha, estado_actual);
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
    
    /////////////////  GETTERS, SETTERS, HASHCODE, EQUALS, toSTRING  //////////////////////////////

    @Override
    public String toString() {
        return "Item{" + "id_item= " + id_item  + ", responsable del item= " + responsable_item +
                ", fecha limite= " + fecha_limite + ", ID equipo asignado= " + equipo_asignado.getId_equipo() +
                ", descripcion= " + descripcion + '}';
    }

    @Override
    public int hashCode() {
        return this.id_item;
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
        final Item other = (Item) obj;
        if (this.id_item != other.id_item) {
            return false;
        }
        return true;
    }

    public int getId_item() {
        return id_item;
    }

    public Tipo_Item getTipo() {
        return tipo;
    }

    public Equipo getEquipo_asignado() {
        return equipo_asignado;
    }

    public void setTipo(Tipo_Item tipo) {
        this.tipo = tipo;
    }

    public void setEquipo_asignado(Equipo equipo_asignado) {
        this.equipo_asignado = equipo_asignado;
    }
    
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
