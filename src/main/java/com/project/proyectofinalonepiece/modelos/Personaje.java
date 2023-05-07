package com.project.proyectofinalonepiece.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Personaje {
    @Id
    private String id;
    @Field
    private String nombre;
    @Field
    private String apellido;
    @Field
    private boolean jubilado;
    @Field
    private int edad;
    @Field
    private double altura;
    @Field
    private int diaNacimiento;
    @Field
    private int mesNacimiento;
}
