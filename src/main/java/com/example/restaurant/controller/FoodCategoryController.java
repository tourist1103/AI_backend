package com.example.restaurant.controller;

import com.example.restaurant.entity.FoodCategory;
import com.example.restaurant.service.FoodCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class FoodCategoryController {
    private final FoodCategoryService foodCategoryService;

    public FoodCategoryController(FoodCategoryService foodCategoryService) {
        this.foodCategoryService = foodCategoryService;
    }

    @GetMapping
    public ResponseEntity<List<FoodCategory>> getAllFoodCategories() {
        List<FoodCategory> foodCategories = foodCategoryService.getAllFoodCategories();
        return ResponseEntity.ok(foodCategories);
    }
}
