package es.cre.usercase.mesas;

import es.cre.modelo.Mesas;
import es.cre.repository.MesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jrguez on 18/08/2017.
 */
@Service
public class FindMesas {
    @Autowired
    private MesasRepository mesasRepository;

    public List<Mesas> execute () {
        return mesasRepository.findAllByOrderByIdAsc();
    }

}
