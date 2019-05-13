package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.buildings.Kingdom;
import com.greenfoxacademy.demo.repositories.KingdomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KingdomService {

  private KingdomRepository kingdomRepository;

  @Autowired
  public KingdomService(KingdomRepository kingdomRepository) {
    this.kingdomRepository = kingdomRepository;
  }

  public void save(Kingdom kingdom){
    kingdomRepository.save(kingdom);
  }

  public Optional<Kingdom> findByName(String kingdomname){
    return kingdomRepository.findByKingdomname(kingdomname);
  }

  public Optional<Kingdom> findById(Long id){
    return kingdomRepository.findById(id);
  }



}
