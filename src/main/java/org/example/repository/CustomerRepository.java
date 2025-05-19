package org.example.repository;

import org.example.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<CustomerEntity,String> {
    List<CustomerEntity> findByName(String name);
    List<CustomerEntity> deleteByName(String name);
}
