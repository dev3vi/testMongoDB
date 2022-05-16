package com.example.testmongodb;

import com.example.testmongodb.entity.CustomerEntity;
import com.example.testmongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class TestMongoDbApplication  {

    public static void main(String[] args) {
        SpringApplication.run(TestMongoDbApplication.class, args);
    }
}
