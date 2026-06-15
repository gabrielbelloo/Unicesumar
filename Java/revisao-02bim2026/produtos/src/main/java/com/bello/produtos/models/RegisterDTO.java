package com.bello.produtos.models;

import com.bello.produtos.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
