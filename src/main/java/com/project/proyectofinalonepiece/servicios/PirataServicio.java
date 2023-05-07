package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.Pirata;

import java.util.List;

public interface PirataServicio {
    List<Pirata> findAllPiratas();
    Pirata findPirata(String id);
    Pirata createPirata(Pirata pirata);
    Pirata updatePirata(Pirata pirata);
    Pirata deletePirata(String id);
}
