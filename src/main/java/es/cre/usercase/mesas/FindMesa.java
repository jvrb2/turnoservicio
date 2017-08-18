package es.cre.usercase.mesas;

import es.cre.modelo.Mesas;
import es.cre.repository.MesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * Created by jrguez on 18/08/2017.
 */
@Service
public class FindMesa {
    @Autowired
    private MesasRepository mesasRepository;
    public Mesas execute (@NotNull Long id) {
        return mesasRepository.findOne(id);
    }

}
