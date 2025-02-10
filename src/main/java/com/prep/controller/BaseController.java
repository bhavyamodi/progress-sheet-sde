package com.prep.controller;

import com.prep.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {
    protected <T> ResponseEntity<ApiResponse<T>> successResponse(String message, T data) {
        return ResponseEntity.ok(new ApiResponse<>(HttpStatus.OK, message, data));
    }

    protected <T> ResponseEntity<ApiResponse<T>> errorResponse(HttpStatus status, String message) {
        return ResponseEntity.status(status).body(new ApiResponse<>(HttpStatus.INTERNAL_SERVER_ERROR, message, null));
    }
}
