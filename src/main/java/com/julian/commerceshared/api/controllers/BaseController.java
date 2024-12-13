package com.julian.commerceshared.api.controllers;

import com.julian.commerceshared.api.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Base controller class
 */
public class BaseController {
  /**
   * Create success response
   * @param response  it can be any object that needs to be returned
   * @param message   message to be returned
   * @return ResponseEntity<BaseResponse>
   */
  protected ResponseEntity<BaseResponse> createSuccessResponse(Object response, String message) {
    BaseResponse baseResponse = new BaseResponse();
    baseResponse.setResponse(response);
    baseResponse.setStatus(200);
    baseResponse.setMessage(message);
    return ResponseEntity.ok(baseResponse);
  }

  /**
   * Create error response
   * @param errorMessage  error message to be returned
   * @return ResponseEntity<BaseResponse>
   */
  protected ResponseEntity<BaseResponse> createErrorResponse(String errorMessage) {
    BaseResponse baseResponse = new BaseResponse();
    baseResponse.setStatus(HttpStatus.BAD_REQUEST.value());
    baseResponse.setSuccess(false);
    baseResponse.setMessage(errorMessage);
    return ResponseEntity.ok(baseResponse);
  }
}
