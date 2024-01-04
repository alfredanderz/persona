package mx.edu.utez.personaj.models.entity;

import jakarta.persistence.*;
import lombok.*;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

@Table(name = "persona" )
public class personabean {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_persona")
private Integer id_persona;

    @Column(name = "nombre")
    private String nombre;

    @Column (name = "apellido1")
    private String apellido1;

    @Column (name = "apellido2")
    private String apellido2;

    @Column(name = "curp")
    private String curp;

    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;



}