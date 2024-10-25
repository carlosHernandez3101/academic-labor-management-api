package com.unicauca.edu.asae.core.dominio.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class Docente extends Persona {
    private Oficina oficinaAsignada;
}
