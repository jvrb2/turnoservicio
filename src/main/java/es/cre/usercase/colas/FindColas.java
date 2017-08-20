package es.cre.usercase.colas;

import es.cre.modelo.Colas;
import es.cre.repository.ColasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jrguez on 20/08/2017.
 */
@Service
public class FindColas {
    @Autowired
    private ColasRepository colasRepository;

    public List<Colas> execute () {
        return colasRepository.findAllByOrderByIdAsc();
    }
}
