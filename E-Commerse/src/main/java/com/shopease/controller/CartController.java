package com.shopease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopease.entity.Cart;
import com.shopease.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public Cart add(@RequestParam Long userId,
                    @RequestParam Long productId,
                    @RequestParam int qty) {
        return cartService.addToCart(userId, productId, qty);
    }
}
