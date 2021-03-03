/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;

/**
 *
 * @author pity_
 */

public class Equipo {
    
    private static int id = 1 ;
    private int id_equipo ;
    private HashSet <Desarrollador> equipo_desarrolladores ;
 
    
    

    public Equipo() {
        this.id_equipo=this.id ;
        this.id ++;
        
    }
    
    public String agregar_desarrollador (Desarrollador e) {
        if (this.equipo_desarrolladores.contains(e.getLegajo())){
            return "El empleado ya esta en el equipo." ;
        } else {
            this.equipo_desarrolladores.add(e) ;
            return "Empleado agregado.";
    
        }     
    }
    
    public String sacar_desarrollador (Desarrollador e) {
        if (this.equipo_desarrolladores.contains(e.getLegajo())){
            this.equipo_desarrolladores.remove(e) ;
            return "Empleado removido.";         
        } else 
            return "El empleado no esta en el equipo." ;
    
    }
    
    
    // BUSCA Y RETORNA EL EMPLEADO, POR LEGAJO.   
    // VALIDAR SI ES NULO, CADA VEZ QUE SE USE.
    public Desarrollador buscar_desarrollador (int legajo_buscado) {  
                  
        for (Desarrollador desarrollador : equipo_desarrolladores) {      
            if (legajo_buscado == desarrollador.getLegajo()){
                return desarrollador ;
            }  
        }      
        return null;       
    }
    
    public void mostrar_equipo () {
        System.out.println("/////////////////////////////////////////////////");
        for (Desarrollador desarrollador : equipo_desarrolladores) {      
            System.out.println(desarrollador.toString());
        } 
        System.out.println("/////////////////////////////////////////////////");
    }

    
    // HACER toSTRING //

    
    
    //////////////// GETTERS, SETTERS, HASHCODE, EQUALS ///////////////////////
    
    public void setEquipo_desarrolladores(HashSet equipo_desarrolladores) {
        this.equipo_desarrolladores = equipo_desarrolladores;
    }

    public HashSet getEquipo_desarrolladores() {
        return equipo_desarrolladores;
    }
    
    
    public int getId_equipo() {
        return id_equipo;
    }

  
    // HASH CODE POR ID DE EQUIPO.
    @Override
    public int hashCode() {
           
        return this.id_equipo;
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
        final Equipo other = (Equipo) obj;
        if (this.id_equipo != other.id_equipo) {
            return false;
        }
        return true;
    }


    
    
}

/*
   private HashSet <Equipo> equipos;

// EN EL CONSTRUCTOR:     
    // Crear la coleccion vacia.
    this.equipos = new HashSet (); 

    // validar si es nulo el retorno.
    public Equipo buscar_equipo (int id) {
                  
        for (Equipo equip : this.equipos) {
            if (id == equip.getId_equipo()){
                return equip ;
                }  
            }  
        return null;
    }

*/
