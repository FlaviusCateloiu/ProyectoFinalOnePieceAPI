package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.Marine;

import java.util.List;

public interface MarineServicio {
    List<Marine> findAllMarines();
    Marine findMarine(String id);
    Marine createMarine(Marine marine);
    Marine updateMarine(Marine marine);
    Marine deleteMarine(String id);
}
