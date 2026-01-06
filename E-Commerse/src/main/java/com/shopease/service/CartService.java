package com.shopease.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopease.entity.Cart;
import com.shopease.entity.CartItem;
import com.shopease.entity.Product;
import com.shopease.repository.CartRepository;
import com.shopease.repository.ProductRepository;
import com.shopease.repository.UserRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepo;
    @Autowired
    private ProductRepository productRepo;
    @Autowired
    private UserRepository userRepo;

    public Cart addToCart(Long userId, Long productId, int qty) {
        Cart cart = cartRepo.findByUserId(userId);
        if (cart == null) {
            cart = new Cart();
            cart.setUser(userRepo.findById(userId).get());
        }

        Product product = productRepo.findById(productId).get();
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(qty);

        cart.getItems().add(item);
        return cartRepo.save(cart);
    }
}
