package com.marlieb.e_com_project.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY) // Needed to see the products, but don't know why
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @JsonFormat
    private String name;
//    @JsonFormat
    private String description;
//    @JsonFormat
    private String brand;
//    @JsonFormat
    private BigDecimal price; // 'BigDecimal' as the price can be any big amount
//    @JsonFormat
    private String category;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") // It seems to need Capital 'MM' for month
    private Date releaseDate;
//    @JsonFormat
    private boolean productAvailable;
//    @JsonFormat
    private int stockQuantity;

    private String imageName;
    private String imageType;
    @Lob // Annotation used as image will be a large object
    private byte[] imageDate;



}
