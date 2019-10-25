package com.thomasmore.RaceService.Repository;

import com.thomasmore.RaceService.Entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface RaceRepository extends JpaRepository<Race, Integer> {
    Race findRaceById(@Param("id") int id);
}
