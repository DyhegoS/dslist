package com.giministorm.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giministorm.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
