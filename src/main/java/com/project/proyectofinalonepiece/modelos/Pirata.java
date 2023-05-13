package com.project.proyectofinalonepiece.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("piratas")
public class Pirata extends Personaje implements Serializable {
    @Field
    private String nomBarcoPirata;
    @Field
    private long precioCabeza;
    @Field
    private String rangoPirata;
}
