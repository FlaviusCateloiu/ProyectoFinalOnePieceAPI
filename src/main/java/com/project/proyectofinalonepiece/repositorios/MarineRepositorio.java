package com.project.proyectofinalonepiece.repositorios;

import com.project.proyectofinalonepiece.modelos.Marine;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MarineRepositorio extends MongoRepository<Marine, String> {
    Marine findByNombre(String nombre);
    List<Marine> findByNombreContaining(String nombre);
    void deleteById(String id);
    Optional<Marine> findById(String id);
}
