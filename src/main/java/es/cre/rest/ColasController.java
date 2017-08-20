package es.cre.rest;

import es.cre.modelo.Colas;
import es.cre.usercase.colas.FindCola;
import es.cre.usercase.colas.FindColas;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jrguez on 20/08/2017.
 */
@RequestMapping(path ="/colas")
@Controller
@AllArgsConstructor
public class ColasController {
    private FindColas findColas;
    private FindCola findCola;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Colas>> findAllColas () {
        return new ResponseEntity<List<Colas>>(findColas.execute(), HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET,path = "/{id}")
    public ResponseEntity<Colas> findById(@PathVariable Long id) {
        return new ResponseEntity<Colas>(findCola.execute(id),HttpStatus.OK);
    }
}
