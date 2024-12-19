package com.julian.commerceshared.dto;

/**
 * AuthDto class
 */
public class AuthDto {
    private String token;
    private String email;

    /**
     * Default constructor for AuthDto.
     */
    public AuthDto() {
    }

    /**
     * Constructor for AuthDto.
     * @param token user's token
     * @param email user's email
     */
    public AuthDto(String token, String email) {
        this.token = "Bearer " + token;
        this.email = email;
    }

    /**
     * Get the token.
     * @return String
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Get the email.
     * @return String
     */
    public String getEmail() {
        return this.email;
    }
}
