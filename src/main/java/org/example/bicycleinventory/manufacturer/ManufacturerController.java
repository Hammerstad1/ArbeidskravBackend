package org.example.bicycleinventory.manufacturer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/manufacturer")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manufacturer> getWebsiteById(@PathVariable long id) {
        return new ResponseEntity<>(manufacturerService.getWebsiteById(id), HttpStatus.OK);
    }

    @GetMapping("/websites")
    public ResponseEntity<List<Manufacturer>> getWebsites() {
        return new ResponseEntity<>(manufacturerService.getWebsites(), HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<Manufacturer> getName() {
        return new ResponseEntity<>(manufacturerService.getName(), HttpStatus.OK);
    }


    @GetMapping("/{in-stock}")
    public ResponseEntity<Manufacturer> getPhoneNumber() {
        return new ResponseEntity<>(manufacturerService.getPhoneNumber(), HttpStatus.OK);
    }

}
