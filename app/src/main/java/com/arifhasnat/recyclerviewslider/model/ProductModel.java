package com.arifhasnat.recyclerviewslider.model;

public class ProductModel {

    public String name;

    public ProductModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
