package com.project.proyectofinalonepiece.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personaje implements Serializable {
    @Id
    private String id;
    @Field
    private String nombre;
    @Field
    private String apellido;
    @Field
    private String descripcion;
    @Field
    private String raza;
    @Field
    private String primeraAparicion;
    @Field
    private boolean jubilado;
    @Field
    private boolean vivo;
    @Field
    private int edad;
    @Field
    private int altura;
    @Field
    private int diaNacimiento;
    @Field
    private int mesNacimiento;
    @Field
    private String idFrutaDelDiablo;
    @Field
    private String idArma;
}
