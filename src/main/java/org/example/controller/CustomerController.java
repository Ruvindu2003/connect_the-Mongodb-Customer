package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.Services.CustomerService;
import org.example.dto.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/Customer")
@RequiredArgsConstructor
@RestController

public class CustomerController {

    public  final CustomerService customerService;
    @GetMapping("/getAll")
    List<Customer> getAll(){
        return customerService.getAll();

    }

    @PostMapping("/AddCustomer")
    public void addCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }

    @GetMapping("/search/{name}")
    public List<Customer>searchCustomer(@PathVariable String name){
        return customerService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable String id){
        customerService.delteCustomer(id);

    }

    @PutMapping("/update")
    public void  updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomr(customer);
    }



}
