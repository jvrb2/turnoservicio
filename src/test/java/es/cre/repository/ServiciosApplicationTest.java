package es.cre.repository;

import es.cre.modelo.Servicios;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.junit.Assert.assertNotNull;

/**
 * Created by jrguez on 20/08/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiciosApplicationTest {
    @Autowired
    ServiciosRepository serviciosRepository;
    @Test
    public void should_findAllServicios() throws Exception {
        List <Servicios> servicios = serviciosRepository.findAllByOrderByIdAsc();
        assertNotNull(servicios);
    }
}
