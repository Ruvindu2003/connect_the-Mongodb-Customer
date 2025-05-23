package org.example.Services;

import org.example.dto.Product;

import java.util.List;

public interface ProductServices {

    void addProduct(Product product);
    Product searchByID(String id);
    void updateProduct(Product product);

    void deleteProduct(String id);
    List<Product> getAll();
    List<Product> searchByName(String name);
}
