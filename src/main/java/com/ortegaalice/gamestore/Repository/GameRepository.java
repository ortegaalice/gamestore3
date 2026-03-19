package com.ortegaalice.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ortegaalice.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game, Integer> {

    
}
