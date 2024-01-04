package mx.edu.utez.personaj.models.dto;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class personadto {


    private Integer id_persona;

    private String apellido1;

    private String apellido2;

    private String curp;

    private String fecha_nacimiento;

  }
