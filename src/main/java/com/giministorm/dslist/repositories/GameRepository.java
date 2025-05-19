package com.giministorm.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giministorm.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
