package com.example.restaurant.service;

import com.example.restaurant.entity.FoodCategory;
import com.example.restaurant.repository.FoodCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodCategoryService {
    private final FoodCategoryRepository foodCategoryRepository;

    public FoodCategoryService(FoodCategoryRepository foodCategoryRepository) {
        this.foodCategoryRepository = foodCategoryRepository;
    }

    public List<FoodCategory> getAllFoodCategories() {
        return foodCategoryRepository.findAll();
    }
}
