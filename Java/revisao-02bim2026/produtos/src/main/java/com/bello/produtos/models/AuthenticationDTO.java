package com.bello.produtos.models;

import jakarta.validation.constraints.NotNull;

public record AuthenticationDTO(
        @NotNull
        String login,
        @NotNull
        String password){
}