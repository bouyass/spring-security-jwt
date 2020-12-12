package com.lyes.springsecurityjwt.models;

public class AuthenticationResponse {

    private final String name = "Lyes";
    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
