package es.cre.rest;

import es.cre.modelo.Turno;
import es.cre.usercase.turno.FindTurno;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jrguez on 17/08/2017.
 */
@RequestMapping(path ="/turnos")
@Controller
@AllArgsConstructor
public class TurnoController {
    private FindTurno findTurno;
    @RequestMapping( method= RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Turno> findById(@PathVariable Long id) {
        Turno turno = findTurno.execute(id);
        return new ResponseEntity<Turno>(turno, HttpStatus.OK);
    }
}
