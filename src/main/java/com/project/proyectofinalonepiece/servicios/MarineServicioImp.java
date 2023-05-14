package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.Marine;
import com.project.proyectofinalonepiece.repositorios.MarineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarineServicioImp implements MarineServicio {

    @Autowired
    private MarineRepositorio marineRepositorio;

    @Override
    public List<Marine> findAllMarines() {
        return marineRepositorio.findAll();
    }

    @Override
    public Marine findMarine(String id) {
        return marineRepositorio.findById(id).orElse(null);
    }

    @Override
    public Marine createMarine(Marine marine) {
        return marineRepositorio.save(marine);
    }

    @Override
    public Marine updateMarine(Marine marine) {
        return marineRepositorio.save(marine);
    }

    @Override
    public Marine deleteMarine(String id) {
        Marine marineBorrado = findMarine(id);
        marineRepositorio.deleteById(id);
        return marineBorrado;
    }
}
