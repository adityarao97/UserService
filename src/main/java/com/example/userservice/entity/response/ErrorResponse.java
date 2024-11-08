package com.example.userservice.entity.response;

import lombok.Getter;

@Getter
public record ErrorResponse(String message, int status) {

}
