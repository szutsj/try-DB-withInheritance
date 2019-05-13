package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.products.Soldier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldierRepository extends CrudRepository<Soldier, Long> {
}
