package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.Pirata;
import com.project.proyectofinalonepiece.repositorios.PirataRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PirataServicioImp implements PirataServicio {

    @Autowired
    private PirataRepositorio pirataRepositorio;

    @Override
    public List<Pirata> findAllPiratas() {
        return pirataRepositorio.findAll();
    }

    @Override
    public Pirata findPirata(String id) {
        return pirataRepositorio.findById(id).orElse(null);
    }

    @Override
    public Pirata createPirata(Pirata pirata) {
        return pirataRepositorio.save(pirata);
    }

    @Override
    public Pirata updatePirata(Pirata pirata) {
        return pirataRepositorio.save(pirata);
    }

    @Override
    public Pirata deletePirata(String id) {
        Pirata pirataBorrado = findPirata(id);
        pirataRepositorio.deleteById(id);
        return pirataBorrado;
    }
}
