package com.example.restaurant.controller;

import com.example.restaurant.entity.FoodItem;
import com.example.restaurant.service.FoodItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class FoodItemController {
    private final FoodItemService foodItemService;

    public FoodItemController(FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }

    @GetMapping
    public ResponseEntity<List<FoodItem>> getAllFoodItems() {
        List<FoodItem> foodItems = foodItemService.getAllFoodItems();
        return ResponseEntity.ok(foodItems);
    }

    @PostMapping
    public ResponseEntity<FoodItem> createFoodItem(@RequestBody FoodItem foodItem) {
        FoodItem createdFoodItem = foodItemService.createFoodItem(foodItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFoodItem);
    }
}

