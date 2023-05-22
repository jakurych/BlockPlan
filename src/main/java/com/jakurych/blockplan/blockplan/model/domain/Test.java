package com.jakurych.blockplan.blockplan.model.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Test {
    @Id
    private Integer id;
    private String name;
    private String description;
}
