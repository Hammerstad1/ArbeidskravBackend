package org.example.bicycleinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class BicycleInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BicycleInventoryApplication.class, args);
    }

}
