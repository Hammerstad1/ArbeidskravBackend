package org.example.bicycleinventory.manufacturer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
public class Manufacturer {
    @Getter
    @Setter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String website;
    private String phoneNumber;
    private String name;

    public Manufacturer(long id, String website, String phoneNumber, String name) {
        this.id = id;
        this.website = website;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }



}
