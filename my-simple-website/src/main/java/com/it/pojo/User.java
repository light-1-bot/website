package com.it.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;

    // getters 和 setters
}
