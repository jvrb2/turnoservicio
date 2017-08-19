package es.cre.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by jrguez on 19/08/2017.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "serv_servicios")
public class Servicios {
    @Id
    private Long id;
    @Column(name="serv_nombre")
    private String serv_nombre;
    @Column(name="serv_descripcion")
    private String serv_descripcion;
    @Column(name="serv_letra")
    private String serv_letra;
    @Column(name="serv_contador")
    private Integer serv_contador;
}
