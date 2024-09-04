package com.example.docker_compose.controller;

import com.example.docker_compose.model.Order;
import com.example.docker_compose.model.User;
import com.example.docker_compose.repository.OrderRepository;
import com.example.docker_compose.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/get")
public class GetController {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public ResponseEntity<List<Order>> getOrderListByUserId() {

        return ResponseEntity.ok(orderRepository.findOrderListByUserId(7L));
    }

    @GetMapping("/all/user")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
