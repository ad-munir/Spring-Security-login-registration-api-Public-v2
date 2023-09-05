package com.spring.auth.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ApiResponse {
    private boolean success;
    private String message;
    private Date timestamp;
    private int code;
}
