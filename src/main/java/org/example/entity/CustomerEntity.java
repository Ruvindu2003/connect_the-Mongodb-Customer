package org.example.entity;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document

public class CustomerEntity {
    @Id
    private String id;
    private String name;
    private Double salary;
    private Integer phoneNumber;
}
