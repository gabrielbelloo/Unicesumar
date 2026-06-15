package com.bello.produtos.models;

import com.bello.produtos.enums.UserRole;
import jakarta.validation.constraints.NotNull;

public record RegisterDTO(
        @NotNull
        String login,
        @NotNull
        String password,
        UserRole role) {
}
