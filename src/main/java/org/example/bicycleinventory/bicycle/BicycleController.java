package org.example.bicycleinventory.bicycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bicycle")
public class BicycleController {

    private final BicycleService bicycleService;

    @Autowired
    public BicycleController(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bicycle> getBicycleById(@PathVariable long id) {
        return new ResponseEntity<>(bicycleService.getBicycleById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Bicycle>> getAllBicycles() {
        return new ResponseEntity<>(bicycleService.getAllBicycles(), HttpStatus.OK);
    }

    @GetMapping("/{in-stock}")
    public ResponseEntity<List<Bicycle>> getBicyclesInStock() {
        return new ResponseEntity<>(bicycleService.getBicyclesInStock(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Bicycle> addNewBicycle(@RequestBody Bicycle bicycle) {
        return new ResponseEntity<>(bicycleService.addBicycle(bicycle), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Bicycle> deleteBicycleById(@RequestBody long id) {
        bicycleService.deleteBicycleById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}