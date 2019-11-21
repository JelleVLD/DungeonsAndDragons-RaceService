package com.thomasmore.RaceService.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Document(collection = "race")
public class Race {
    @Id
    private String id;
    private String name;
    private int speed;
    private String size;
    private String abilityBonuses;
}
