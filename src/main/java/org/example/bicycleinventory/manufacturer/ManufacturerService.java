package org.example.bicycleinventory.manufacturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {

    private final ManufacturerRepo manufacturerRepo;

    @Autowired
    public ManufacturerService(ManufacturerRepo repo) {
        this.manufacturerRepo = repo;
    }
    public Manufacturer getWebsiteById(long id) {
        return manufacturerRepo.findById(id);
    }

    public List<Manufacturer> getWebsites() {
        return manufacturerRepo.findAll();
    }

    public Manufacturer getName() {
        return (Manufacturer) manufacturerRepo.findAll();
    }

    public Manufacturer getPhoneNumber() {
        return (Manufacturer) manufacturerRepo.findAll();
    }

    public Manufacturer addManufacturer(Manufacturer manufacturer) {
        return manufacturerRepo.save(manufacturer);
    }
}
