package com.example.jpa.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserOrderDto {
    private String username;
    private String email;
    private Double price;
}
