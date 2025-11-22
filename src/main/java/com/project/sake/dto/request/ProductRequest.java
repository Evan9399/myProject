package com.project.sake.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "產品上傳請求")
public class ProductRequest {

    @Schema(description = "產品名稱", example = "臺虎精釀")
    private String name;

    @Schema(description = "產品價格", example = "10000")
    private double price;

    @Schema(description = "產品數量", example = "10")
    private int quantity;

    @Schema(description = "產品描述", example = "好喝的")
    private String description;

}