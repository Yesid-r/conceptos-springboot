package com.springsimplespasos.conceptosbasicos.usoproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BaseProperties  implements CommandLineRunner {

    @Autowired
    ReadCommonProperties commonPropertiesommonProperties;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("app base url: " + commonPropertiesommonProperties.getBaseUrl());
        System.out.println("app base test : " + commonPropertiesommonProperties.getTest());

    }
}
