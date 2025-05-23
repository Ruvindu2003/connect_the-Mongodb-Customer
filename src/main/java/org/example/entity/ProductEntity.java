package org.example.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class ProductEntity {

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private String category;
    private String image_path;

}
