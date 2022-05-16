package com.example.testmongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


@Document("customer")
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private String love;

    public CustomerEntity(String id, String name, String love) {
        this.id = id;
        this.name = name;
        this.love = love;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(love, that.love);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, love);
    }
}
