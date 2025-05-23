package org.example.repository;

import org.example.entity.ProductEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository extends MongoRepository<ProductEntity,String> {
    List<ProductEntity> findByName(String name);
}
