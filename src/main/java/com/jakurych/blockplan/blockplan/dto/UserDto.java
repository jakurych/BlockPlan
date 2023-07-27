package com.jakurych.blockplan.blockplan.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
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
public class UserDto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String email;
        private String username;
        private LocalDateTime registrationDate; // Dodane pole reprezentujące datę rejestracji użytkownika.
        private ZonedDateTime zonedDateTime;


}
