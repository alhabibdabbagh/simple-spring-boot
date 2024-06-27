package com.project.simple.first.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrinkModel {
    private UUID id;
    private String name;
    private String description;
    private int price;
    private String image;

}
