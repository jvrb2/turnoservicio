package es.cre.repository;

import es.cre.modelo.Colas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jrguez on 20/08/2017.
 */
@Repository
public interface ColasRepository extends JpaRepository<Colas, Long>{
    List<Colas> findAllByOrderByIdAsc();
    Colas findByIdEquals(Long id);
}
