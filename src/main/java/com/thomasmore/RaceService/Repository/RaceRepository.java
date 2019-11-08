package com.thomasmore.RaceService.Repository;

import com.thomasmore.RaceService.Entity.Race;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface RaceRepository extends MongoRepository<Race, String> {
//    Race findRaceById(@Param("id") String id);
}
