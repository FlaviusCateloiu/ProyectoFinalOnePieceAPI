package com.project.proyectofinalonepiece.repositorios;

import com.project.proyectofinalonepiece.modelos.FrutaDelDiablo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface FrutaDelDiabloRepositorio extends MongoRepository<FrutaDelDiablo, String> {
    FrutaDelDiablo findByNombre(String nombre);
    List<FrutaDelDiablo> findByNombreContaining(String nombre);
    void deleteById(String id);
    Optional<FrutaDelDiablo> findById(String id);
}
