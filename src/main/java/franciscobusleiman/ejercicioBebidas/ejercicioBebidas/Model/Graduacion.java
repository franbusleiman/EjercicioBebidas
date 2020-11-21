package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model;

import javax.persistence.*;

@Embeddable
public class Graduacion {


    private int porcentaje;


    public Graduacion(){}

    public Graduacion(int porcentaje){
    this.porcentaje = porcentaje;
}
    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}
