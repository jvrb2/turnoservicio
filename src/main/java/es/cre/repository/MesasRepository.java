package es.cre.repository;

import es.cre.modelo.Mesas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jrguez on 18/08/2017.
 */
@Repository
public interface MesasRepository extends JpaRepository<Mesas, Long> {
    List<Mesas> findAllByOrderByIdAsc();
    Mesas findByIdEquals(Long id);
}

