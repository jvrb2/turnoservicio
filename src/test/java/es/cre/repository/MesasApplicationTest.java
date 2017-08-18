package es.cre.repository;

import es.cre.modelo.Mesas;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jrguez on 18/08/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MesasApplicationTest {
    @Autowired
    private MesasRepository mesasRepository;

    @Test
    public void should_findByMesasAll() throws Exception {
        List<Mesas> mesas= mesasRepository.findAllByOrderByIdAsc();
        assertNotNull(mesas);
    }

}
