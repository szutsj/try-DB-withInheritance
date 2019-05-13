package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.buildings.Building;
import com.greenfoxacademy.demo.repositories.BuildingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuildingService {

  private BuildingRepo buildingRepo;

  @Autowired
  public BuildingService(BuildingRepo buildingRepo) {
    this.buildingRepo = buildingRepo;
  }

  public void save(Building building){
    buildingRepo.save(building);
  }

  public Optional<Building> findById(Long id){
     return buildingRepo.findById(id);
  }


}
