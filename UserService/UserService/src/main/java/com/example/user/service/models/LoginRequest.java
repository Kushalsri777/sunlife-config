package com.example.user.service.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequest {
    private String userId;
    private String userName;
    private String password;
}
