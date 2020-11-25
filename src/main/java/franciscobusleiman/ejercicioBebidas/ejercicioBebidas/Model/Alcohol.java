package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
@Data
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

@Enumerated(value = EnumType.STRING)
    private TipoBebida tipoBebida;


    public Alcohol(){

    }

    public Alcohol(String nombre, TipoBebida tipoBebida){
        this.nombre = nombre;
        this.tipoBebida = tipoBebida;

    }


}
