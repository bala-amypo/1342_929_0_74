package com.example.demo.newentity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity {
    @Id
    @GeneratedValue(stargery=GenerationType.)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message = "no blank allowed")
    @Email(message="invalid format")
    private String email;

}
