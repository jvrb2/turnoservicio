package es.cre;

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
/*


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Planet>> findAll() {
        List<Planet> planets = findAllPlanets.execute();

        return new ResponseEntity<List<Planet>>(planets, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Planet> findById(@PathVariable Long id) {
        Planet planet = findPlanet.execute(id);

        return new ResponseEntity<Planet>(planet, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Planet> save(@RequestBody Planet planet) {
        Planet saved = savePlanet.execute(planet);
        return new ResponseEntity<Planet>(saved, HttpStatus.CREATED);    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public ResponseEntity<Planet> update(@PathVariable Long id,@RequestBody Planet planet) {
        Planet found = findPlanet.execute(id);
        if (found == null) {
            return new ResponseEntity<Planet>(HttpStatus.NO_CONTENT);
        }

        Planet updated = savePlanet.execute(planet);
        return new ResponseEntity<Planet>(updated, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public ResponseEntity<Planet> delete(@PathVariable Long id) {
        deletePlanet.execute(id);

        return new ResponseEntity<Planet>(HttpStatus.NO_CONTENT);
    }

}

 */