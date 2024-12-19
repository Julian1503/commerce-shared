package com.julian.commerceshared.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Base response class
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {
    private Object response;
    private int status = 200;
    private String message;
    private boolean success = true;
    private List<String> errorResponse;

    /**
     * Constructor
     */
    public BaseResponse() {}

    /**
     * Constructor
     * @param response response object
     * @param status http status
     * @param message message
     * @param success success
     * @param errorResponse error response
     */
    public BaseResponse(Object response, int status, String message, boolean success, List<String> errorResponse) {
        this.response = response;
        this.status = status;
        this.message = message;
        this.success = success;
        this.errorResponse = errorResponse;
    }

    /**
     * Get response
     * @return Object
     */
    public Object getResponse() {
        return response;
    }

    /**
     * Get status
     * @return int
     */
    public int getStatus() {
        return status;
    }

    /**
     * Get message
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * Get success
     * @return boolean
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Get error response
     * @return List&lt;String&gt;
     */
    public List<String> getErrorResponse() {
        return errorResponse;
    }

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