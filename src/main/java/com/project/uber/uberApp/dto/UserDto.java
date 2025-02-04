package com.project.uber.uberApp.dto;

import com.project.uber.uberApp.entities.enums.Role;
import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private String email;
    private Set<Role> roles;
}
