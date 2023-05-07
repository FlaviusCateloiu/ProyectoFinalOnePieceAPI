package com.project.proyectofinalonepiece.repositorios;

import com.project.proyectofinalonepiece.modelos.Pirata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PirataRepositorio extends MongoRepository<Pirata, String> {
    Pirata findByNombre(String nombre);
    List<Pirata> findByNombreContaining(String nombre);
    void deleteById(String id);
    Optional<Pirata> findById(String id);
}
