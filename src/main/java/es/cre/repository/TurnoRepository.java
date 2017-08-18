package es.cre.repository;

import es.cre.modelo.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jrguez on 16/08/2017.
 */
@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
    Turno findByServicioIgnoreCase(String name);
}