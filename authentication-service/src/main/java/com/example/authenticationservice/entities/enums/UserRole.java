package com.example.authenticationservice.entities.enums;

public enum UserRole {
    ROLE_USER("ROLE_USER"), ROLE_ADMIN("ROLE_ADMIN");
    private String value;

    UserRole(String value) {this.value = value;}
    public String getValue() {
        return value;
    }
}
