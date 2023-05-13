package com.project.proyectofinalonepiece.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("frutas")
public class FrutaDelDiablo {
    @Id
    private String id;
    @Field
    private String nombre;
    @Field
    private String descripcion;
    @Field
    private String primeraAparicion;
    @Field
    private String tipo;
    @Field
    private String habilidad;
    @Field
    private String idConsumidor;
}
