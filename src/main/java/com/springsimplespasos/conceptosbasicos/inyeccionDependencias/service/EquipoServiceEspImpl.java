package com.springsimplespasos.conceptosbasicos.inyeccionDependencias.service;

import com.springsimplespasos.conceptosbasicos.inyeccionDependencias.domain.Equipo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//@Primary
@Component("equipo-espania")
@ConditionalOnProperty(prefix = "app", name = "implementacion" , havingValue = "espania")
public class EquipoServiceEspImpl implements EquipoService{

    private List<Equipo> equipos = new ArrayList<>(Arrays.asList(
            new Equipo(1,"Real madrid" ,1901, LocalDate.of(1901,8,25)),
            new Equipo(2,"FC Barcelona" ,1905, LocalDate.of(1905,9,3)),
            new Equipo(3,"Atletico Madrid" ,1905, LocalDate.of(1905,1,1))
    ));
    @Override
    public Optional<Equipo> obtenerEquipoById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Equipo> obtenerTodos() {
        return this.equipos;
    }
}
