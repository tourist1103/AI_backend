package com.example.restaurant.service;

import com.example.restaurant.entity.FoodItem;
import com.example.restaurant.repository.FoodItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    private final FoodItemRepository foodItemRepository;

    public FoodItemService(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    public FoodItem createFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }
}
