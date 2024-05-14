package com.example.restaurant.repository;

import com.example.restaurant.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
