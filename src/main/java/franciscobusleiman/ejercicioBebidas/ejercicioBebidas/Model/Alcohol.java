package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Alcohol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    @Embedded
    private Graduacion graduacion;

    @OneToOne(cascade = CascadeType.ALL)
    private Acompanante acompanante;

    private TipoBebida tipoBebida;


    public Alcohol(){

    }

    public Alcohol(String nombre, TipoBebida tipoBebida){
        this.nombre = nombre;
        this.tipoBebida = tipoBebida;

    }

    public Acompanante getAcompanante() {
        return acompanante;
    }

    public void setAcompanante(Acompanante acompanante) {
        this.acompanante = acompanante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoBebida getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(TipoBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public Graduacion getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(Graduacion graduacion) {
        this.graduacion = graduacion;
    }
}
