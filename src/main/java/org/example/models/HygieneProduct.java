package org.example.models;

import java.math.BigDecimal;

public class HygieneProduct extends Product{
    private String content;

    public HygieneProduct(BigDecimal price, String name, String content) {
        super(price, name);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString(){
        return "Nombre: " + this.getName() + " /// " + "Contenido: " + this.getContent() + " /// " + "Precio: $" + this.getPrice();
    }
}
