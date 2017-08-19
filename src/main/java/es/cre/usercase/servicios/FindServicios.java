package es.cre.usercase.servicios;

import es.cre.modelo.Servicios;
import es.cre.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jrguez on 19/08/2017.
 */
@Service
public class FindServicios {
    private ServiciosRepository serviciosRepository;
    public FindServicios (ServiciosRepository serviciosRepository) {
        this.serviciosRepository = serviciosRepository;
    }

    public List<Servicios> execute () {
        return serviciosRepository.findAllByOrderByIdAsc();
    }
}
