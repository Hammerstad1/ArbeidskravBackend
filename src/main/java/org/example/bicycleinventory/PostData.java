package org.example.bicycleinventory;

import com.github.javafaker.Faker;
import org.example.bicycleinventory.bicycle.Bicycle;
import org.example.bicycleinventory.bicycle.BicycleRepo;
import org.example.bicycleinventory.bicycle.BicycleService;
import org.example.bicycleinventory.manufacturer.Manufacturer;
import org.example.bicycleinventory.manufacturer.ManufacturerRepo;
import org.example.bicycleinventory.manufacturer.ManufacturerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class PostData implements CommandLineRunner {

    private final BicycleService bicycleService;
    private ManufacturerService manufacturerService;
    private final Faker faker;

    public PostData(BicycleService bicycleService, ManufacturerService manufacturerService) {
        this.bicycleService = bicycleService;
        this.manufacturerService = manufacturerService;
        this.faker = new Faker();
    }

    @Override
    public void run(String... args) throws Exception {
        for (long i = 0; i < 50; i++) {
            Manufacturer manufacturer = manufacturerService.addManufacturer(
                    new Manufacturer(
                            faker.number().randomNumber(),
                            faker.internet().domainName(),
                            faker.bothify("PhoneNumber:#######"),
                            faker.company().name()

                    ));
            Bicycle bicycle = bicycleService.saveBicycle(
                    new Bicycle(
                            faker.number().randomNumber(),
                            faker.company().name(),
                            faker.color().name(),
                            faker.bothify("Model-####"),
                            faker.number().numberBetween(0, 50),
                            manufacturer
                    ));
        }

    }
}
