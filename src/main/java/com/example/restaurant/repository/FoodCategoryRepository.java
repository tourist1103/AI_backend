package com.example.restaurant.repository;

import com.example.restaurant.entity.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
}
