package com.project.proyectofinalonepiece.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("piratas")
public class Pirata extends Personaje {
    @Field
    private String nomBarcoPirata;
    @Field
    private long precioCabeza;
    @Field
    private String rangoPirata;
}
