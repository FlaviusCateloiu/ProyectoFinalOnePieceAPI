package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.FrutaDelDiablo;
import com.project.proyectofinalonepiece.modelos.Marine;
import com.project.proyectofinalonepiece.repositorios.FrutaDelDiabloRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrutaDelDiabloImp implements FrutaDelDiabloServicio {

    @Autowired
    FrutaDelDiabloRepositorio frutaDelDiabloRepositorio;

    @Override
    public List<FrutaDelDiablo> findAllFrutasDelDiablo() {
        return frutaDelDiabloRepositorio.findAll();
    }

    @Override
    public FrutaDelDiablo findFrutaDelDiablo(String id) {
        return frutaDelDiabloRepositorio.findById(id).orElse(null);
    }

    @Override
    public FrutaDelDiablo createFrutaDelDiablo(FrutaDelDiablo frutaDelDiablo) {
        return frutaDelDiabloRepositorio.save(frutaDelDiablo);
    }

    @Override
    public FrutaDelDiablo updateFrutaDelDiablo(FrutaDelDiablo frutaDelDiablo) {
        return frutaDelDiabloRepositorio.save(frutaDelDiablo);
    }

    @Override
    public FrutaDelDiablo deleteFrutaDelDiablo(String id) {
        FrutaDelDiablo frutaDelDiabloBorrado = findFrutaDelDiablo(id);
        frutaDelDiabloRepositorio.deleteById(id);
        return frutaDelDiabloBorrado;
    }
}
