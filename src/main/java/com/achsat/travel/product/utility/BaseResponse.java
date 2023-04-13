package com.achsat.travel.product.utility;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
public class BaseResponse<T> {
    @JsonProperty("payload")
    private T payload;
    private String errorCode;
    private String errorMessage;
}
