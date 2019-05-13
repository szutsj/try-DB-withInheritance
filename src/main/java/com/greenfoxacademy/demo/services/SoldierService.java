package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.products.Soldier;
import com.greenfoxacademy.demo.repositories.SoldierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoldierService {

  private SoldierRepository soldierRepository;

  @Autowired
  public SoldierService(SoldierRepository soldierRepository) {
    this.soldierRepository = soldierRepository;
  }

  public void save(Soldier soldier){
    soldierRepository.save(soldier);
  }
}
