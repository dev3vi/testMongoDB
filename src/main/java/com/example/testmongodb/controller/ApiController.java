package com.example.testmongodb.controller;

import com.example.testmongodb.entity.CustomerEntity;
import com.example.testmongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("get")
    private List<CustomerEntity> test(){
        return customerRepository.findAll();
    }

    @PostMapping("create")
    private List<CustomerEntity> create(){
        CustomerEntity customerEntity = new CustomerEntity("1","tran dung","okok");
        customerRepository.save(customerEntity);
        return customerRepository.findAll();
    }

    @PostMapping("update")
    private List<CustomerEntity> update(){
        Optional<CustomerEntity> customerEntity = customerRepository.findById("1");
        if (customerEntity.isPresent()){
            customerEntity.get().setLove("okela");
            customerRepository.save(customerEntity.get());
        }
        return customerRepository.findAll();
    }

    @DeleteMapping("delete")
    private List<CustomerEntity> delete(){
        Optional<CustomerEntity> customerEntity = customerRepository.findById("1");
        if (customerEntity.isPresent()){
            customerRepository.delete(customerEntity.get());
        }
        return customerRepository.findAll();
    }

}
