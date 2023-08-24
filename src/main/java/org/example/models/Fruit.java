package org.example.models;

import java.math.BigDecimal;

public class Fruit extends Product{
    private String salesUnit;

    public Fruit(BigDecimal price, String name, String salesUnit) {
        super(price, name);
        this.salesUnit = salesUnit;
    }

    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit;
    }

    public String toString(){
        return "Nombre: " + this.getName() + " /// " + "Precio: $" + this.getPrice() + " /// " + "Unidad de venta: " + this.getSalesUnit();
    }
}
