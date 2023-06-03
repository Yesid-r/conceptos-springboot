package com.springsimplespasos.conceptosbasicos.inyeccionDependencias.service;

import com.springsimplespasos.conceptosbasicos.inyeccionDependencias.domain.Equipo;
import org.springframework.stereotype.Component;

import java.util.Optional;

public interface EquipoService {

    Optional<Equipo> obtenerEquipoById(Integer id);
    Iterable<Equipo> obtenerTodos();
}
