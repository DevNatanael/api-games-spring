package com.natanael.intensivaoSpring.services;

import com.natanael.intensivaoSpring.dto.GameMinDTO;
import com.natanael.intensivaoSpring.entities.Game;
import com.natanael.intensivaoSpring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> resultDto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return resultDto;
    }
}
