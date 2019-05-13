package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.buildings.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BuildingRepo extends CrudRepository<Building, Long> {

  @Override
  Optional<Building> findById(Long aLong);
}
