package com.springsimplespasos.conceptosbasicos.usoproperties;

import com.springsimplespasos.conceptosbasicos.usoproperties.herencia.ReadBarProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BaseProperties  implements CommandLineRunner {

    @Autowired
    ReadCommonProperties commonPropertiesommonProperties;

    @Autowired
    ReadFooProperties readFooProperties;

    @Autowired
    ReadBarProperties barProperties;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("app base url: " + commonPropertiesommonProperties.getBaseUrl());
        System.out.println("app base test : " + commonPropertiesommonProperties.getTest());

        System.out.println("---------------------------------------------------------------");
        System.out.println("app.foo.client: " + readFooProperties.getClientUrl());
        System.out.println("app.foo.customer: " + readFooProperties.getCustomerUrl());
        System.out.println("-----------------------------------------------------------------");
        System.out.println("bar.name: " + barProperties.getName());
        System.out.println("bar.url.client: " + barProperties.getUrl().getClient());
        System.out.println("bar.url.customer: " + barProperties.getUrl().getCustomer());

    }
}
