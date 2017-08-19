package es.cre.rest;

import es.cre.modelo.Servicios;
import es.cre.usercase.servicios.FindServicio;
import es.cre.usercase.servicios.FindServicios;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jrguez on 19/08/2017.
 */
@RequestMapping(path="/servicios")
@Controller
@AllArgsConstructor
public class ServiciosController {
    private FindServicios findServicios;
    private FindServicio findServicio;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Servicios>> findAllServicios() {
        List<Servicios> servicios = findServicios.execute();
        return new ResponseEntity<List<Servicios>>(servicios, HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Servicios> findById(@PathVariable Long id) {
        return new ResponseEntity<Servicios>(findServicio.execute(id),HttpStatus.OK);
    }

}
