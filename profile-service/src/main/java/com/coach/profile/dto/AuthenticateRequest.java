package com.coach.profile.dto;

import lombok.Data;

/**
 * The class "AuthenticateRequest" contains two private fields, "username" and "password", and is
 * annotated with "@Data" to generate getters, setters, and other boilerplate code.
 */
@Data
public class AuthenticateRequest {
    private String username;
    private String password;
}
