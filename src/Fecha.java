public class Fecha {
    
    public int dia;
    public int mes;
    public int anio;

    public Fecha() {
        dia=1;
        mes=1;
        anio=2000;
    }

    public Fecha(int dia,int mes,int anio) {
        super();
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean fechaCorrecta() {
        boolean diaCorrecto,mesCorrecto,anioCorrecto;

        anioCorrecto = anio >= 1980 && anio <=2020;
        mesCorrecto = mes >=1 && mes <=12;

        switch(mes) {
            case 2:
                diaCorrecto = (dia >= 1 && dia <=28);
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = (dia >=1 && dia <=30);
                break;
            default:
                diaCorrecto = (dia >=1 && dia <=31);
        }
        return diaCorrecto && mesCorrecto && anioCorrecto;
    }
    
    @Override
    public String toString () {
        
        return this.dia + "/" + this.mes + "/" + this.anio ;  
    }
}
