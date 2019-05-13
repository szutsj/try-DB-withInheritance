package com.greenfoxacademy.demo.models.buildings;

import javax.persistence.Entity;

@Entity
public class Farm extends ProductionBuilding {

  public Farm(Kingdom kingdom) {
    super(kingdom);
  }

  public Farm() {
    super();
  }

 }
