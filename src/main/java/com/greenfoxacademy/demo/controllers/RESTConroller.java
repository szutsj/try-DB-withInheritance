package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.buildings.*;
import com.greenfoxacademy.demo.services.BuildingService;
import com.greenfoxacademy.demo.services.KingdomService;
import com.greenfoxacademy.demo.services.SoldierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RESTConroller {
  private BuildingService buildingService;
  private KingdomService kingdomService;
  private SoldierService soldierService;

  @Autowired
  public RESTConroller(BuildingService buildingService, KingdomService kingdomService, SoldierService soldierService) {
    this.buildingService = buildingService;
    this.kingdomService = kingdomService;
    this.soldierService = soldierService;
  }

  @PostMapping("/register")
  public String register(@RequestParam String name){
    if (kingdomService.findByName(name).isPresent()){
      return "Már van!";
    }

    Kingdom kingdom = new Kingdom(name);
    kingdomService.save(kingdom);
    Townhall townhall = new Townhall(kingdom);
    buildingService.save(townhall);
    return "Mentve";

  }

  @PostMapping("/newBuilding")
  public String save(@RequestParam String building, Long id){

    if(kingdomService.findById(id).isPresent()){
      Kingdom kingdom = kingdomService.findById(id).get();
      if (building.equals("Farm")){
        Farm farm = new Farm(kingdom);
        buildingService.save(farm);
      }  else if (building.equals("Mine")){
        Mine mine = new Mine(kingdom);
        buildingService.save(mine);
      }  else if (building.equals("Barakk")){
        Barakk barakk = new Barakk(kingdom);
        buildingService.save(barakk);
      }
      return "Saved";
    }
     return "Nincs ilyen id!";
  }

  @PostMapping("levelUp/{id}")
  public String update(@PathVariable (name ="id") long id){
    if (buildingService.findById(id).isPresent()) {
        Building building = buildingService.findById(id).get();
        int currentLevel = building.getLevel();
        currentLevel += 1;
        building.setLevel(currentLevel);
        buildingService.save(building);
      }
      return "Saved";
  }

}
