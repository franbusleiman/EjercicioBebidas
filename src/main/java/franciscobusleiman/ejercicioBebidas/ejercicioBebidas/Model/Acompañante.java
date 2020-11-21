package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Acompañante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "acompañantes")
    private Set<Alcohol> alcoholes;

    public Acompañante() {}

    public Acompañante(String name){
        this.name = name;
    }

    public Set<Alcohol> getAlcoholes() {
        return alcoholes;
    }

    public void setAlcoholes(Set<Alcohol> alcoholes) {
        this.alcoholes = alcoholes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
