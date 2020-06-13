package ru.kpfu.itis.lpgallery.dto;

import lombok.Data;
import ru.kpfu.itis.lpgallery.models.Role;

@Data
public class SignUpDto {
    private String nickname;
    private String email;
    private String password;
    private String password_repeat;
    private Role role;
}
