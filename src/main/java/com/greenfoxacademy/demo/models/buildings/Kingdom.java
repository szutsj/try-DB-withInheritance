package com.greenfoxacademy.demo.models.buildings;

import javax.persistence.*;

@Entity
public class Kingdom {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String kingdomname;

  public Kingdom(String kingdomname) {
    this.kingdomname = kingdomname;
  }

  public Kingdom() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getKingdomname() {
    return kingdomname;
  }

  public void setKingdomname(String kingdomname) {
    this.kingdomname = kingdomname;
  }

}
