package com.thomasmore.RaceService.Repository;

import com.sun.org.apache.xpath.internal.objects.XNull;
import com.thomasmore.RaceService.Entity.Race;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin
public interface RaceRepository extends MongoRepository<Race, String> {
//    Race findRaceByRaceid(@Param("raceid") Integer raceId);
    List<Race> findRacesBySpeed(@Param("speed") Integer speed);
    List<Race> findRacesBySize(@Param("size") String size);
    Race findRacesByName(@Param("name") String name);

}

// http://localhost:8001/races/search/findRacesBySpeed?speed=30
// http://localhost:8001/races/search/findRacesBySize?size=medium
// http://localhost:8001/races/search/findRacesByName?name=Dwarf
