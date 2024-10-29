package org.example.bicycleinventory.bicycle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.bicycleinventory.manufacturer.Manufacturer;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Bicycle {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String bicycleName;
    private String bicycleColor;
    private String bicycleModel;
    private int bicycleInStock;
    private String manufacturer;



    public Bicycle(long id, String bicycleName, String bicycleColor, String bothify, int bicycleInStock, Manufacturer manufacturer) {
        this.id = id;
        this.bicycleName = bicycleName;
        this.bicycleColor = bicycleColor;
        this.bicycleModel = bothify;
        this.bicycleInStock = bicycleInStock;
        this.manufacturer = manufacturer.toString();
    }

}
