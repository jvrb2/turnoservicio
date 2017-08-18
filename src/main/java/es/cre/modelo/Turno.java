package es.cre.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by jrguez on 13/08/2017.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "turno")
public class Turno {
    @Id
    @GeneratedValue
    private Long turnoId;
    @Column(name="servicio")
    private String servicio;
    @CreatedDate
    private LocalDateTime create;
    @LastModifiedDate
    private LocalDateTime edited;
}
