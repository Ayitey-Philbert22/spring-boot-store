package com.codewithphil.store.carts;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class UpdateCartItemRequest {
    @Min(1) @Max(100)
    private Integer quantity;
}
