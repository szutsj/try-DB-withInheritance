package com.greenfoxacademy.demo.models.buildings;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public abstract class ProductionBuilding extends Building {

  @ManyToOne
  private Kingdom kingdom;

  public ProductionBuilding(Kingdom kingdom) {
    super();
    this.kingdom = kingdom;
  }

  public ProductionBuilding() {
    super();
  }

  public Kingdom getKingdom() {
    return kingdom;
  }

  public void setKingdom(Kingdom kingdom) {
    this.kingdom = kingdom;
  }
}
