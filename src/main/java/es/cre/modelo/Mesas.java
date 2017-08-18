package es.cre.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by jrguez on 18/08/2017.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mesa_mesas")
public class Mesas {
    @Id
    private Long id;
    @Column(name="mesa_nombre")
    private String nombre;
    @Column(name="mesa_ip")
    private String ip;
}
