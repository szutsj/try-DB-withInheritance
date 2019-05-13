package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.buildings.Kingdom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KingdomRepository extends CrudRepository<Kingdom, Long> {

  Optional<Kingdom> findByKingdomname(String kingdomname);


}
