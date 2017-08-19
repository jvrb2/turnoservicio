package es.cre.usercase.servicios;

import es.cre.modelo.Servicios;
import es.cre.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jrguez on 19/08/2017.
 */
@Service
public class FindServicio {
    @Autowired
    ServiciosRepository serviciosRepository;

    public Servicios execute (Long id) {
        return serviciosRepository.findOne(id);
    }
}
