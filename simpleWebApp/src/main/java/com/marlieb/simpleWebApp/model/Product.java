package com.marlieb.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

@Data // Bundles @Getter, @Setter, @ToString, @EqualsAndHashCode,@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity // Annotation to use to make an entity
public class Product {

    @Id // for the variable that will be a primary key
    private int productId;
    private String ProductName;
    private int productPrice;
}
