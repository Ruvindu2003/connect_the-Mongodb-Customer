package org.example.Services.impl;

import lombok.RequiredArgsConstructor;
import org.example.Services.CustomerService;
import org.example.dto.Customer;
import org.example.entity.CustomerEntity;
import org.example.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service

public class CustomerImpl implements CustomerService {
    public  final CustomerRepository customerRepository;
    public final ModelMapper modelMapper;

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(modelMapper.map(customer, CustomerEntity.class));



    }

    @Override
    public void updateCustomr(Customer customer) {
        customerRepository.save(modelMapper.map(customer, CustomerEntity.class));


    }

    @Override
    public List<Customer> getAll() {
        List<Customer>customerList=new ArrayList<>();
        List<CustomerEntity>customerEntities=customerRepository.findAll();
        customerEntities.forEach(CustomerEntity->{
            customerList.add(modelMapper.map(CustomerEntity, Customer.class));
        });


        return  customerList;
    }

    @Override
    public Customer searchById(String id) {


        return  modelMapper.map(customerRepository.findById(id),Customer.class);
    }

    @Override
    public void delteCustomer(String id) {

   customerRepository.deleteById(id);


    }

    @Override
    public List<Customer> findByName(String name) {
        List<CustomerEntity> customerEntities = customerRepository.findByName(name);
        List<Customer> customerList = new ArrayList<>();

        customerEntities.forEach(CustomerEntity -> {
            customerList.add(modelMapper.map(CustomerEntity, Customer.class));
        });
        return customerList;
    }
}
