package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Data
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


}
