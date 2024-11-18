package com.devtoday.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtoday.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long>{

}
