package com.thomasmore.RaceService.Repository;

import com.thomasmore.RaceService.Entity.Race;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface RaceRepository extends MongoRepository<Race, String> {
//    Race findRaceByRaceid(@Param("raceid") Integer raceId);
    List<Race> findRacesBySpeed(@Param("speed") Integer speed);
    List<Race> findRacesBySize(@Param("size") String size);
    Race findRacesByName(@Param("name") String name);
    Race findRacesById(@Param("id") String id);
    List<Race> findByNameNotNull();


}

// http://localhost:8001/races/search/findRacesBySpeed?speed=30
// http://localhost:8001/races/search/findRacesBySize?size=medium
// http://localhost:8001/races/search/findRacesByName?name=Dwarf
// http://localhost:8001/races/search/findRacesById?id=5dd6737d1c9d4400008a5a40
// http://localhost:8001/races/search/findByNameNotNull
