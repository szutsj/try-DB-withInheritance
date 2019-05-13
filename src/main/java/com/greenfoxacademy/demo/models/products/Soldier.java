package com.greenfoxacademy.demo.models.products;

import com.greenfoxacademy.demo.models.buildings.Barakk;

import javax.persistence.*;

@Entity
public class Soldier {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int level;
  private boolean isathome;
  @ManyToOne
  private Barakk barakk;

  public Soldier(int level, boolean isAtHome, Barakk barakk) {
    this.level = level;
    this.isathome = isathome;
    this.barakk = barakk;
  }

  public Soldier() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public boolean isAtHome() {
    return isathome;
  }

  public void setAtHome(boolean atHome) {
    isathome = atHome;
  }

  public Barakk getBarakk() {
    return barakk;
  }

  public void setBarakk(Barakk barakk) {
    this.barakk = barakk;
  }

}
