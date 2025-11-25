package com.project.sake.dto.response;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ResponseBody
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Integer id;
    /**
     * 產品名稱
     */
    private String name;
    /**
     * 產品價格
     */
    private Double price;
    /**
     * 產品數量
     */
    private Integer quantity;
    /**
     * 產品描述
     */
    private String description;
}
