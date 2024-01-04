package mx.edu.utez.personaj.controller;

import lombok.Data;
import mx.edu.utez.personaj.models.dto.personadto;
import mx.edu.utez.personaj.models.entity.personabean;
import mx.edu.utez.personaj.service.impl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class personacontroller {




    @RestController
    @Data
    @RequestMapping("api/persona")
    public class ControllerGeneros {

        private final impl personaservice;

        @PostMapping("/")
        public personadto create(@RequestBody personadto personadto){
            personabean personasCreate =personaservice.save(personadto) ;
            return personadto.builder()
                    .id_persona(personasCreate.getId_persona())
                    .nombre(personasCreate.getNombre())
                    .apellido1(personasCreate.getApellido1())
                    .apellido2(personasCreate.getCurp())
                    .curp(personasCreate.getApellido1())
                    .fecha_nacimiento(personasCreate.getFecha_nacimiento())
                    .build();
        }

        @PutMapping("/")
        public personadto update (@RequestBody personadto dtoGeneros) {
            personabean personaUpdate = personaservice.save(dtoGeneros);

            return personadto.builder()
                    .id_persona(personaUpdate.getId_persona())
                    .nombre(personaUpdate.getNombre())
                    .apellido1(personaUpdate.getApellido1())
                    .apellido2(personaUpdate.getCurp())
                    .curp(personaUpdate.getApellido1())
                    .fecha_nacimiento(personaUpdate.getFecha_nacimiento())
                    .build();

        }

        @GetMapping("/")
        public List<personabean> getGeneros(){
            return personaservice.findAll();
        }

        @GetMapping("/{id}")
        public  personabean getGenero(@PathVariable Integer id){
            return personaservice.findById(id);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Integer id){
            personabean genero = personaservice.findById(id);
            personaservice.delete(personas);
        }
    }

}
