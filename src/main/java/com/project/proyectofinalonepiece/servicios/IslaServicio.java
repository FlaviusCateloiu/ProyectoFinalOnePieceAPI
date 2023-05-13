package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.Isla;

import java.util.List;

public interface IslaServicio {
    List<Isla> findAllIslas();
    Isla findIsla(String id);
    Isla createIsla(Isla isla);
    Isla updateIsla(Isla isla);
    Isla deleteIsla(String id);
}
