package com.greenfoxacademy.demo.models.buildings;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Townhall extends Building {
  private int food;
  private int gold;
  @OneToOne
  private Kingdom kingdom;

  public Townhall(Kingdom kingdom) {
    super();
    this.food = 3;
    this.gold = 3;
    this.kingdom = kingdom;
  }

  public Townhall() {
    super();
  }

  public int getFood() {
    return food;
  }

  public void setFood(int food) {
    this.food = food;
  }

  public int getGold() {
    return gold;
  }

  public void setGold(int gold) {
    this.gold = gold;
  }

  public Kingdom getKingdom() {
    return kingdom;
  }

  public void setKingdom(Kingdom kingdom) {
    this.kingdom = kingdom;
  }

}
