package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Repositories;

import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model.Alcohol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AlcoholRepository extends CrudRepository<Alcohol, Long> {

    List<Alcohol> findAll();
}
