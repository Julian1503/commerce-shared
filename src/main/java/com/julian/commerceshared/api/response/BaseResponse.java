package com.julian.commerceshared.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Base response class
 */

@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {
    private Object response;
    private int status = 200;
    private String message;
    private boolean success = true;
    private List<String> errorResponse;

    /**
     * Set response
     * @param message set a message to the response
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * Set response
     * @param response set a response object to the response
     */
    public void setResponse(Object response) {
        this.response = response;
    }
    /**
     * Set status
     * @param status set a http status to the response
     */
    public void setStatus(int status) {
        this.status = status;
    }
    /**
     * Set message
     * @param success set if the response was successful
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Set error response
     * @param errorResponse set a list of error messages
     */
    public void setErrorResponse(List<String> errorResponse) {
        this.errorResponse = errorResponse;
    }
}