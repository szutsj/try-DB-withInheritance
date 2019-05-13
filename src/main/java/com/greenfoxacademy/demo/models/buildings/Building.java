package com.greenfoxacademy.demo.models.buildings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Building {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int level;

  public Building() {
    level = 1;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
