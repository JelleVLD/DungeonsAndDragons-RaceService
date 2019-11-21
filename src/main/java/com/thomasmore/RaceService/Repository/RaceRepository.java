package com.thomasmore.RaceService.Repository;

import com.thomasmore.RaceService.Entity.Race;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface RaceRepository extends MongoRepository<Race, String> {
//    Race findRaceByRaceid(@Param("raceid") Integer raceId);
    List<Race> findRacesBySpeed(@Param("speed") Integer speed);
}

// http://localhost:8001/races/search/findRacesBySpeed?speed=30
// http://localhost:8001/races/search/findRaceByRaceId?raceid=1
