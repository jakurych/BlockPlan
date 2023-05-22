package com.jakurych.blockplan.blockplan.model.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    private String name;
    private String surname;
    private String email;
    public String username;
    @Id
    private int id;

}
