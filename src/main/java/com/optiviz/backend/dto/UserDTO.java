package com.optiviz.backend.dto;

public class UserDTO {

    private String clerkUserId;
    private String name;
    private String email;

    public UserDTO() {}

    public UserDTO(String clerkUserId, String name, String email) {
        this.clerkUserId = clerkUserId;
        this.name = name;
        this.email = email;
    }

    public String getClerkUserId() {
        return clerkUserId;
    }

    public void setClerkUserId(String clerkUserId) {
        this.clerkUserId = clerkUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}