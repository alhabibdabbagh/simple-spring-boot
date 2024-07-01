package com.project.simple.first.web.controller;

import com.project.simple.first.model.DrinkModel;
import com.project.simple.first.service.DrinkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/drink")
public class DrinkController {

    private final DrinkService drinkService;

    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping({"/{drinkId}"})
    public ResponseEntity<DrinkModel> getDrink(@PathVariable("drinkId") UUID drinkId) {
        return new ResponseEntity<>(drinkService.getDrinkById(drinkId), HttpStatus.OK);

    }
}
