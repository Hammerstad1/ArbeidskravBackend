package org.example.bicycleinventory.manufacturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManufacturerRepo {

    Manufacturer findById(long id);

    List<Manufacturer> findAll();

    Manufacturer save(Manufacturer manufacturer);
}
