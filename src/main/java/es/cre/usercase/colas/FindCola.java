package es.cre.usercase.colas;

import es.cre.modelo.Colas;
import es.cre.repository.ColasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * Created by jrguez on 20/08/2017.
 */
@Service
public class FindCola {
    @Autowired
    private ColasRepository colasRepository;
    public Colas execute(@NotNull Long id) {
        return colasRepository.findOne(id);
    }
}
