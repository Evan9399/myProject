package com.project.sake.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistRequest {
    /**
     * 帳號
     */
    @NotBlank
    private String username;
    /**
     * 密碼
     */
    @NotBlank
    private String password;
    /**
     * email
     */
    @Email
    @NotBlank
    private String email;
}
