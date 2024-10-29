package org.example.bicycleinventory.bicycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicycleService {

    private final BicycleRepo repo;

    @Autowired
    public BicycleService(BicycleRepo repo) {
        this.repo = repo;
    }

    public List<Bicycle> getAllBicycles() {
        return repo.findAll();
    }

    public List<Bicycle> getBicyclesInStock() {
        return repo.findAll();
    }

    public Bicycle getBicycleById(long id) {

        return repo.findById(id);
    }

    public Bicycle addBicycle(Bicycle bicycle) {
        return repo.save(bicycle);
    }

    public Bicycle saveBicycle(Bicycle bicycle) {
        return repo.save(bicycle);
    }
    public void deleteBicycleById(long id) {
        repo.deleteById(id);
    }

}
