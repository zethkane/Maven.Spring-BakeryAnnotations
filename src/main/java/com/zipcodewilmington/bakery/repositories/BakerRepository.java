package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Baker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BakerRepository extends CrudRepository<Baker, Long> {
}
