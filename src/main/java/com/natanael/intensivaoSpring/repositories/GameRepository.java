package com.natanael.intensivaoSpring.repositories;

import com.natanael.intensivaoSpring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
