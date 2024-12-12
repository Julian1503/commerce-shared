package com.julian.commerceshared.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {
    private Object response;
    private int status = 200;
    private String message;
    private boolean success = true;
    private List<String> errorResponse;
}