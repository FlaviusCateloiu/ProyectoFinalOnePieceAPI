package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.Isla;
import com.project.proyectofinalonepiece.repositorios.IslaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IslaServicioImp implements IslaServicio {

    @Autowired
    private IslaRepositorio islaRepositorio;

    @Override
    public List<Isla> findAllIslas() {
        return islaRepositorio.findAll();
    }

    @Override
    public Isla findIsla(String id) {
        return islaRepositorio.findById(id).orElse(null);
    }

    @Override
    public Isla createIsla(Isla isla) {
        return islaRepositorio.save(isla);
    }

    @Override
    public Isla updateIsla(Isla isla) {
        return islaRepositorio.save(isla);
    }

    @Override
    public Isla deleteIsla(String id) {
        Isla islaBorrada = findIsla(id);
        islaRepositorio.deleteById(id);
        return islaBorrada;
    }
}
