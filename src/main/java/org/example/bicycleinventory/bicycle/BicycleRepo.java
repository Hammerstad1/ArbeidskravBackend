package org.example.bicycleinventory.bicycle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BicycleRepo {

    List<Bicycle> findAll();

    Bicycle findById(long id);

    Bicycle save(Bicycle bicycle);

    void deleteById(long id);
}
