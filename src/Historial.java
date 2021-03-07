
import java.util.ArrayList;

class Historial {
    
    public ArrayList <String> historial;
    
    public Historial() {
        historial = new ArrayList ();
                
    }

    public ArrayList getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList historial) {
        this.historial = historial;
    }
    
    public void ver_historial () {
        for (String s : this.historial){
            System.out.println(s);
        }
    }
    
    private void agregarHistorial (String s) {
        this.historial.add(s) ;
    }
    
    public void actualizarHistorial (Empleado responsable, Fecha fecha, String estado_actual) {
        String s =  ("  ///  " + "Fecha: "+ fecha+ " Responsable: "+ responsable +" Estado actual: " + estado_actual );  
        this.agregarHistorial(s);
    }
    
    
    
}
