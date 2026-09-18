package org.example;

import java.math.BigDecimal;

public class DiscountDecorator extends ProductDecorator {

    //Field to store the discount percentage
    private BigDecimal discountPercentage;

    //Constructor to initialize the decorated product and discount percentage
    public DiscountDecorator(
            Sellable decoratedProduct,
            BigDecimal discountPercentage) {
        super(decoratedProduct);
        this.discountPercentage = discountPercentage;
    }

        //Decorator som lägger till/ändra funktionalitet för ett objekt vid runtime
        @Override
        public BigDecimal getPrice () {
            BigDecimal originalPrice = decoratedProduct.getPrice();
            BigDecimal discount = discountPercentage
                    .divide(BigDecimal.valueOf(100));
            BigDecimal discountAmount = originalPrice.multiply(discount);
            return originalPrice.subtract(discountAmount);

        }
    }
