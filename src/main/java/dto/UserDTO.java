package com.optiviz.backend.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String clerkUserId;
    private String name;
    private String email;
}