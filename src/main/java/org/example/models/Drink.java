package org.example.models;

import java.math.BigDecimal;

public class Drink extends Product{
    private double liters;

    public Drink(BigDecimal price, String name, double liters) {
        super(price, name);
        this.liters = liters;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public String toString(){
        return "Nombre: " + this.getName() + " /// " + "Litros: " + this.getLiters() + " /// " + "Precio: $" + this.getPrice();
    }
}
