package com.julian.commerceshared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * AuthDto class
 */
@Data
@AllArgsConstructor
public class AuthDto {
    private String token;
    private String email;

    /**
     * Default constructor for AuthDto.
     */
    public AuthDto() {
    }
}
