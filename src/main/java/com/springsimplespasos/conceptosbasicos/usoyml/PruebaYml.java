package com.springsimplespasos.conceptosbasicos.usoyml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PruebaYml implements CommandLineRunner {

    @Autowired
    ReadYml readYml;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------------------YAML----------------------------");
        System.out.println("servido.application.nombre: " + readYml.getAplicacion().get("nombre"));
        readYml.getConfiguracion().get("files-system").forEach(System.out::println);
        System.out.println("ususrio root username: " + readYml.getUsuarios().get("root").getUserName() + "\n password: " + readYml.getUsuarios().get("root").getPassword());

    }
}
