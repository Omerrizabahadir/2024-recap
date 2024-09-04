package com.example.docker_compose.dto;

import lombok.AllArgsConstructor;


    @AllArgsConstructor
    public class UserOrderDTO {
        private String username;
        private String email;
        private Double price;
    }
