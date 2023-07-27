package com.jakurych.blockplan.blockplan.model.domain;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Builder
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String username;
    private LocalDateTime registrationDate; // Dodane pole reprezentujące datę rejestracji użytkownika.
    private ZonedDateTime zonedDateTime;
}
