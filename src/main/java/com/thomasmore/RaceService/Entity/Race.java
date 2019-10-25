package com.thomasmore.RaceService.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name="Race")
@Data
@NoArgsConstructor
public class Race {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="speed")
    private String speed;
    @Column(name="alignment")
    private String alignment;
    @Column(name="size")
    private String size;

    @Column(name="abilityBonuses")
    private String abilityBonuses;
}
