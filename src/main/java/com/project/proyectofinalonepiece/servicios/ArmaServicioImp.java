package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.Arma;
import com.project.proyectofinalonepiece.repositorios.ArmaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaServicioImp implements ArmaServicio {

    @Autowired
    private ArmaRepositorio armaRepositorio;

    @Override
    public List<Arma> findAllArmas() {
        return armaRepositorio.findAll();
    }

    @Override
    public Arma findArma(String id) {
        return armaRepositorio.findById(id).orElse(null);
    }

    @Override
    public Arma createArma(Arma arma) {
        return armaRepositorio.save(arma);
    }

    @Override
    public Arma updateArma(Arma arma) {
        return armaRepositorio.save(arma);
    }

    @Override
    public Arma deleteArma(String id) {
        Arma armaBorrada = findArma(id);
        armaRepositorio.deleteById(id);
        return armaBorrada;
    }
}
