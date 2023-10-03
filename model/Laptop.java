package com.examly.springapp.model;

public class Laptop {
    private int laptopid;
    private String laptopBrand;
    private int laptopPrice;

    public Laptop() {
    }

    public Laptop(int laptopid, String laptopBrand, int laptopPrice) {
        this.laptopid = laptopid;
        this.laptopBrand = laptopBrand;
        this.laptopPrice = laptopPrice;
    }

    // Getters and setters
    public int getLaptopid() {
        return laptopid;
    }

    public void setLaptopid(int laptopid) {
        this.laptopid = laptopid;
    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public int getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(int laptopPrice) {
        this.laptopPrice = laptopPrice;
    }
}