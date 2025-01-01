package com.marlieb.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Bundles @Getter, @Setter, @ToString, @EqualsAndHashCode,@RequiredArgsConstructor
@AllArgsConstructor
public class Product {
    private int productId;
    private String ProductName;
    private int productPrice;
}
