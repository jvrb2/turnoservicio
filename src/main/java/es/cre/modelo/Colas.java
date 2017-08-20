package es.cre.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by jrguez on 19/08/2017.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cola_cola")
public class Colas {

    @Id
    private Long id;
    @Column(name="mesa_id")
    private Long mesa_id;
    @Column(name="serv_id")
    private Long serv_id;
    @Column(name="cola_fecha")
    private String cola_fecha;
    @Column(name="cola_numero")
    private Long cola_numero;

}
