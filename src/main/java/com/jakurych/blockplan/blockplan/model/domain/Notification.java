package com.jakurych.blockplan.blockplan.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class Notification {
    @Id
    int id;
    String type;
    String text;
}
