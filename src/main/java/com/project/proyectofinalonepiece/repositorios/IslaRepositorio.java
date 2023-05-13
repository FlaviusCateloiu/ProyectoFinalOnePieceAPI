package com.project.proyectofinalonepiece.repositorios;
import com.project.proyectofinalonepiece.modelos.Isla;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface IslaRepositorio extends MongoRepository<Isla, String> {
    Isla findByNombre(String nombre);
    Isla findByIdPirataDominante(String idPirataDominante);
    List<Isla> findByNombreContaining(String nombre);
    void deleteById(String id);
    Optional<Isla> findById(String id);
}
