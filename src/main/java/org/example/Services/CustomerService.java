package org.example.Services;

import org.example.dto.Customer;

import java.util.List;

public interface CustomerService {
    public void createCustomer(Customer customer);
    void updateCustomr(Customer customer);
    List<Customer>getAll();
    Customer  searchById(String id);
    void delteCustomer(String id);
    List<Customer> findByName(String name);

}
