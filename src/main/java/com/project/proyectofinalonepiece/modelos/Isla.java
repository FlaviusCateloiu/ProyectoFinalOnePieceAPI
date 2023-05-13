package com.project.proyectofinalonepiece.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("islas")
public class Isla implements Serializable {
    @Id
    private String id;
    @Field
    private String nombre;
    @Field
    private String descripcion;
    @Field
    private String primeraAparicion;
    @Field
    private String region;
    @Field
    private String idPirataDominante;
}
