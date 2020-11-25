package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model;

import lombok.Data;

import javax.persistence.*;
@Data
@Embeddable
public class Graduacion {


    private int porcentaje;


    public Graduacion(){}

    public Graduacion(int porcentaje){
    this.porcentaje = porcentaje;
}

}
