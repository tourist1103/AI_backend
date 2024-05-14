package com.example.restaurant.controller;

import com.example.restaurant.entity.Cart;
import com.example.restaurant.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/create")
    public ResponseEntity<Cart> createCart() {
        Cart cart = cartService.createCart();
        return ResponseEntity.status(HttpStatus.CREATED).body(cart);
    }
}
