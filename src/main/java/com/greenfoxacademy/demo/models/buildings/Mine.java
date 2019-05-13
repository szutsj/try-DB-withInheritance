package com.greenfoxacademy.demo.models.buildings;

import javax.persistence.Entity;

@Entity
public class Mine extends ProductionBuilding {


  public Mine(Kingdom kingdom) {
    super(kingdom);
  }

  public Mine() {
    super();
  }

 }
