package dev.roy.mongodemo.product;

import dev.roy.mongodemo.category.Category;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@Builder
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private double quantity;
    private double rating;

    private List<String> tags;

    @DBRef
    private Category category;

}
