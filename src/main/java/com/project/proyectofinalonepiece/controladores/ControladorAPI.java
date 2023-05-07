package com.project.proyectofinalonepiece.controladores;

import com.project.proyectofinalonepiece.modelos.Marine;
import com.project.proyectofinalonepiece.modelos.Pirata;
import com.project.proyectofinalonepiece.servicios.MarineServicio;
import com.project.proyectofinalonepiece.servicios.PirataServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorAPI {
    @Autowired
    private PirataServicio pirataServicio;
    @Autowired
    private MarineServicio marineServicio;

    //PIRATAS
    @GetMapping(value = "/api/personajes/piratas")
    public ResponseEntity<List<Pirata>> getPiratas() {
        return ResponseEntity.ok(pirataServicio.findAllPiratas());
    }

    @GetMapping(value = "/api/personajes/piratas/{id}")
    public ResponseEntity<Pirata> getPiloto(@PathVariable("id") String id) {
        return ResponseEntity.ok(pirataServicio.findPirata(id));
    }

    @PostMapping(value = "/api/create/personajes/piratas")
    public ResponseEntity<Pirata> addPiloto(@RequestBody Pirata pirata) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pirataServicio.createPirata(pirata));
    }

    @PutMapping(value = "/api/update/personajes/piratas/{id}")
    public ResponseEntity<Pirata> updatePiloto(@PathVariable("id") String id, @RequestBody Pirata pirata) {
        Pirata pirataExistente = pirataServicio.findPirata(pirata.getId());

        if (pirataExistente == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(pirataServicio.updatePirata(pirata));
    }

    @DeleteMapping(value = "/api/delete/personajes/piratas/{id}")
    public ResponseEntity<Pirata> removePiloto(@PathVariable("id") String id) {
        return ResponseEntity.ok(pirataServicio.deletePirata(id));
    }

    //MARINES
    @GetMapping(value = "/api/personajes/marines")
    public ResponseEntity<List<Marine>> getMarines() {
        return ResponseEntity.ok(marineServicio.findAllMarines());
    }

    @GetMapping(value = "/api/personajes/marines/{id}")
    public ResponseEntity<Marine> getMarine(@PathVariable("id") String id) {
        return ResponseEntity.ok(marineServicio.findMarine(id));
    }

    @PostMapping(value = "/api/create/personajes/marines")
    public ResponseEntity<Marine> addMarine(@RequestBody Marine marine) {
        return ResponseEntity.status(HttpStatus.CREATED).body(marineServicio.createMarine(marine));
    }

    @PutMapping(value = "/api/update/personajes/marines/{id}")
    public ResponseEntity<Marine> updateMarine(@PathVariable("id") String id, @RequestBody Marine marine) {
        Marine marineExistente = marineServicio.findMarine(marine.getId());

        if (marineExistente == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(marineServicio.updateMarine(marine));
    }

    @DeleteMapping(value = "/api/delete/personajes/marines/{id}")
    public ResponseEntity<Marine> removeMarine(@PathVariable("id") String id) {
        return ResponseEntity.ok(marineServicio.deleteMarine(id));
    }
}
