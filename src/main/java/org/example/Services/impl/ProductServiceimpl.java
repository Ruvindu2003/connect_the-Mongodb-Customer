package org.example.Services.impl;

import lombok.RequiredArgsConstructor;
import org.example.Services.ProductServices;
import org.example.dto.Product;
import org.example.entity.ProductEntity;
import org.example.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceimpl implements ProductServices {
    final ProductRepository productRepository;
    final ModelMapper modelMapper;

    @Override
    public void addProduct(Product product) {
        productRepository.save(modelMapper.map(product, ProductEntity.class));
    }

    @Override
    public Product searchByID(String id) {
        return modelMapper.map(productRepository.findById(id), Product.class);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(modelMapper.map(product, ProductEntity.class));
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        List<ProductEntity> all = productRepository.findAll();

        all.forEach(productEntity -> {
            productList.add(modelMapper.map(productEntity, Product.class));
        });

        return productList;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<ProductEntity> byName = productRepository.findByName(name);
        List<Product> productList = new ArrayList<>();
        byName.forEach(productEntity -> {
            productList.add(modelMapper.map(productEntity, Product.class));
        });

        return productList;
    }
}
