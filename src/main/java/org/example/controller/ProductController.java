package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.Services.ProductServices;
import org.example.dto.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {
    final ProductServices productServices;

    @PostMapping("/product-add")
    public void addProduct(@RequestBody Product product){
        productServices.addProduct(product);
    }

    @GetMapping("/product-search-by-id/{id}")
    public Product searchProduct(@PathVariable String id){
        Product product = productServices.searchByID(id);
        System.out.println(product);
        return product;
    }

    @GetMapping("/product-search-by-name/{name}")
    public List<Product> searchByName(@PathVariable String name){
        return productServices.searchByName(name);
    }

    @PutMapping("/product-update")
    public void updateProduct(@RequestBody Product product){
        productServices.updateProduct(product);
    }

    @DeleteMapping("/product-delete/{id}")
    public void deleteProduct(@PathVariable String id){
        productServices.deleteProduct(id);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productServices.getAll();
    }
}
