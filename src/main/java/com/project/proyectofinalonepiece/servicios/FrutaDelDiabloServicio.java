package com.project.proyectofinalonepiece.servicios;

import com.project.proyectofinalonepiece.modelos.FrutaDelDiablo;

import java.util.List;

public interface FrutaDelDiabloServicio {
    List<FrutaDelDiablo> findAllFrutasDelDiablo();
    FrutaDelDiablo findFrutaDelDiablo(String id);
    FrutaDelDiablo createFrutaDelDiablo(FrutaDelDiablo frutaDelDiablo);
    FrutaDelDiablo updateFrutaDelDiablo(FrutaDelDiablo frutaDelDiablo);
    FrutaDelDiablo deleteFrutaDelDiablo(String id);
}
