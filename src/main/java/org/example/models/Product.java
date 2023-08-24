package org.example.models;

import java.math.BigDecimal;

public class Product implements Comparable<Product>{
    private BigDecimal price;
    private String name;

    public Product(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}
