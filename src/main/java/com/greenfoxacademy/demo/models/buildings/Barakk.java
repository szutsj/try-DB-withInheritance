package com.greenfoxacademy.demo.models.buildings;

import com.greenfoxacademy.demo.models.products.Soldier;

import javax.persistence.Entity;

@Entity
public class Barakk extends ProductionBuilding {

  public Barakk(Kingdom kingdom) {
    super(kingdom);
  }

  public Barakk() {
    super();
  }


}
