package com.codewithphil.store.carts;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddItemCartRequest {
    @NotNull
    private Long productId;
}
