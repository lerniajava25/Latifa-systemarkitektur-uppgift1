package org.example;

import java.math.BigDecimal;

//Create abstract class ProductDecorator that implements Sellable interface
public abstract class ProductDecorator implements Sellable {

    //Field to store the decorated product
    protected Sellable decoratedProduct;

    // Constructor to wrap a Sellable product
    public ProductDecorator(Sellable decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    //Implement interface methods by delegating the calls to the decorated product
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
