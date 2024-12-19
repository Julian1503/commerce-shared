package com.julian.commerceshared.dto;

public class ErrorMessage {
    private String error;
    private String code;
    private String cause;

    public ErrorMessage() {
    }

    public ErrorMessage(String error, String code, String cause) {
        this.error = error;
        this.code = code;
        this.cause = cause;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
