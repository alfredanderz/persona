package mx.edu.utez.personaj.service;

import mx.edu.utez.personaj.models.entity.personabean;

import java.util.List;

public interface impl {


        personabean save( personabean persona);

        personabean findById(Integer id);

        List< personabean> findAll();

        void delete( personabean persona);

    }


