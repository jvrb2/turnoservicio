package es.cre.rest;

import es.cre.modelo.Mesas;
import es.cre.usercase.mesas.FindMesa;
import es.cre.usercase.mesas.FindMesas;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jrguez on 18/08/2017.
 */
@RequestMapping(path ="/mesas")
@Controller
@AllArgsConstructor
public class MesasController {
    private FindMesas findMesas;
    private FindMesa findMesa;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Mesas>> findAllMesas() {
        List <Mesas> mesas = findMesas.execute();
        return new ResponseEntity<List<Mesas>>(mesas, HttpStatus.OK);
    }
    @RequestMapping( method= RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Mesas> findById(@PathVariable Long id) {
        Mesas mesa = findMesa.execute(id);
        return new ResponseEntity<Mesas>(mesa, HttpStatus.OK);
    }
}