package com.example.restaurant.service;

import com.example.restaurant.entity.Cart;
import com.example.restaurant.entity.CartItem;
import com.example.restaurant.repository.CartItemRepository;
import org.springframework.stereotype.Service;

@Service
public class CartItemService {
    private final CartItemRepository cartItemRepository;

    public CartItemService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public CartItem addCartItem(Cart cart, CartItem cartItem) {
        cartItem.setCart(cart);
        return cartItemRepository.save(cartItem);
    }

    public void removeCartItem(Long cartItemId) {
        cartItemRepository.deleteById(cartItemId);
    }

    // Add more methods as needed
}
