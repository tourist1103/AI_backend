package com.example.restaurant.service;

import com.example.restaurant.entity.Cart;
import com.example.restaurant.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart createCart() {
        return cartRepository.save(new Cart());
    }
}
