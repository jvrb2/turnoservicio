package es.cre.repository;

import es.cre.modelo.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jrguez on 19/08/2017.
 */
@Repository
public interface ServiciosRepository extends JpaRepository <Servicios, Long> {
    List<Servicios> findAllByOrderByIdAsc();
    Servicios findByIdEquals(Long id);
}
