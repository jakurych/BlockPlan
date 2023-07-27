package com.jakurych.blockplan.blockplan.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class CategoryDto {
    @Id
    private int id;
    private String name;
    private int color;
}
