package ec.edu.insteclrg.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Comunicado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String titulo;
    
    @Column(nullable = false)
    private String descripcion;
    
  
    @Column(nullable = false)
    private String contenido;
    
   

    @Column(nullable = false)
    private LocalDateTime fechaPublicacion;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Habitante Barrio;

}


