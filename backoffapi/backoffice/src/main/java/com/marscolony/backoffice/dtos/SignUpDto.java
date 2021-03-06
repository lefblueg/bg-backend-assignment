package com.marscolony.backoffice.dtos;

import lombok.Data;

@Data

public class SignUpDto {
    
    private String name;
    private String username;
    private String email;
    private String password;
    private Boolean admin = false;
}
