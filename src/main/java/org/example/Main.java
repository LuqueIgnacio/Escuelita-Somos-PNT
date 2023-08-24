package org.example;

import org.example.models.Drink;
import org.example.models.Fruit;
import org.example.models.HygieneProduct;
import org.example.models.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = getProducts();

        products.forEach(product -> System.out.println(product.toString()) );
        System.out.println("=============================");
        System.out.println("Producto más caro: " + Collections.max(products).getName());
        System.out.println("Producto más barato: " + Collections.min(products).getName());
    }

    private static List<Product> getProducts(){
        Drink p1 = new Drink(BigDecimal.valueOf(20) , "Coca-Cola Zero", 1.5);
        Drink p2 = new Drink(BigDecimal.valueOf(18) , "Coca-Cola", 1.5);
        HygieneProduct p3 = new HygieneProduct(BigDecimal.valueOf(19), "Shampo Sedal", "500ml");
        Fruit p4 = new Fruit(BigDecimal.valueOf(64), "Frutilla", "kilo");

        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        return products;
    }
}