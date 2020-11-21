package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Acompanante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

   @OneToOne(mappedBy = "acompanante")
    private Alcohol alcohol;

    public Acompanante() {}

    public Acompanante(String nombre){
        this.nombre = nombre;
    }


    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
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
}
