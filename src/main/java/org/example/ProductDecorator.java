package org.example;

import java.math.BigDecimal;

//Create abstract class ProductDecorator that implements Sellable interface
public abstract class ProductDecorator implements Sellable {

    //Fält
    protected Sellable decoratedProduct;

    // Constructor to wrap a Sellable product
    public ProductDecorator(Sellable decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public String getName() {
        return decoratedProduct.getName();
    }
    @Override
    public String getId() {
        return decoratedProduct.getId();
    }

    @Override
    public BigDecimal getPrice() {
        return decoratedProduct.getPrice();
    }




}
