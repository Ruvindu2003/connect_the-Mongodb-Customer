package org.example.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    private String id;
    private String name;
    private String description;
    private Double price;
    private String category;
    private String image_path;

}
