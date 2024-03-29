package com.ecommerce.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDTO {
    @Size(min = 3, max = 10, message = "Invalid first name!(3-10 characters)")
    private String firstName;
    @Size(min = 2, max = 10, message = "Invalid first name!(3-10 characters)")
    private String lastName;
    @Size(min = 5, max = 15, message = "Invalid password !(5-15 characters)")
    private String userName;
    @Size(min = 5, max = 15, message = "Invalid password !(5-15 characters)")
    private String password;

    private String repeatPassword;
}
