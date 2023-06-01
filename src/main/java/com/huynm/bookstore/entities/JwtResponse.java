package com.huynm.bookstore.entities;

import com.huynm.bookstore.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    private String token;

    private String username;

    private List<Role> roles;
}
