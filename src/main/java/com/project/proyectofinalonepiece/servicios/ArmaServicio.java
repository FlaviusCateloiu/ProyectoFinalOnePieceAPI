package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.Arma;

import java.util.List;

public interface ArmaServicio {
    List<Arma> findAllArmas();
    Arma findArma(String id);
    Arma createArma(Arma arma);
    Arma updateArma(Arma arma);
    Arma deleteArma(String id);
}
