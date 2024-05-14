package com.example.restaurant.controller;

import com.example.restaurant.entity.Cart;
import com.example.restaurant.entity.CartItem;
import com.example.restaurant.service.CartItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cartItems")
public class CartItemController {
    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @PostMapping("/addToCart/{cartId}")
    public ResponseEntity<CartItem> addCartItem(@PathVariable Long cartId, @RequestBody CartItem cartItem) {
        // Assume cartId is sent from the frontend to specify the cart
        Cart cart = new Cart();
        cart.setId(cartId);
        CartItem addedCartItem = cartItemService.addCartItem(cart, cartItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedCartItem);
    }

    @DeleteMapping("/remove/{cartItemId}")
    public ResponseEntity<Void> removeCartItem(@PathVariable Long cartItemId) {
        cartItemService.removeCartItem(cartItemId);
        return ResponseEntity.noContent().build();
    }

    // Add more endpoints as needed
}
