package com.prep.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private HttpStatus status;
    private String message;
    private T data;
}