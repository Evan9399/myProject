package com.project.sake.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "用戶登入請求")
public class UserLoginRequest {

    @NotBlank
    @Schema(description = "用戶名稱")
    private String username;

    @NotBlank
    @Schema(description = "用戶密碼")
    private String password;
}
