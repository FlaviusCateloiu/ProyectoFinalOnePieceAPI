package com.project.proyectofinalonepiece.repositorios;

import com.project.proyectofinalonepiece.modelos.Arma;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ArmaRepositorio extends MongoRepository<Arma, String> {
    Arma findByNombre(String nombre);
    Arma findByIdPropietario(String idPrpietario);
    List<Arma> findByNombreContaining(String nombre);
    void deleteById(String id);
    Optional<Arma> findById(String id);
}
