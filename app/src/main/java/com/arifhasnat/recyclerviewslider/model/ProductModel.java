package com.arifhasnat.recyclerviewslider.model;

public class ProductModel {

    public String name;
    public int image;


    public ProductModel(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "name='" + name + '\'' +
                ", image=" + image +
                '}';
    }
}
