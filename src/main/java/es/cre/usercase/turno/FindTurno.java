package es.cre.usercase.turno;

import es.cre.modelo.Turno;
import es.cre.repository.TurnoRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * Created by jrguez on 17/08/2017.
 */
@Service
public class FindTurno {
    private TurnoRepository turnoRepository;
    public FindTurno (TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }
    public Turno execute (@NotNull Long id) {
        return turnoRepository.findOne(id);
    }
}
