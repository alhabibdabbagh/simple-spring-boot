package com.project.simple.first.service;

import com.project.simple.first.model.DrinkModel;

import java.util.UUID;


public interface DrinkService {
    DrinkModel getDrinkById(UUID drinkId);

}
