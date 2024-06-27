package com.project.simple.first.service.impl;

import com.project.simple.first.model.DrinkModel;
import com.project.simple.first.service.DrinkService;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class DrinkServiceImpl implements DrinkService {
    @Override
    public DrinkModel getDrinkById(UUID drinkId) {
        return DrinkModel.builder()
                .id(UUID.randomUUID())
                .name("Drink Name")
                .description("Drink Description")
                .price(0)
                .image("URL").build();
    }
}
