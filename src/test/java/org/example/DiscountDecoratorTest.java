package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountDecoratorTest {

    @Test
    public void shouldApplyDiscount() {
        //Arrange
        Product laptop = new Product.Builder()
                .id("id1")
                .name("Laptop")
                .price(new BigDecimal("1000"))
                .build();
        //Act
        Sellable discountedLaptop = new DiscountDecorator(laptop, 20);
        //Assert controller
        assertEquals("id1", discountedLaptop.getId());
        assertEquals("Laptop", discountedLaptop.getName());
        assertEquals(new BigDecimal("1000"), laptop.getPrice());
        assertEquals(new BigDecimal("800.0"), discountedLaptop.getPrice());
    }

    //decoratedProduct.getPrice() test
    @Test
    public void shouldDelegatePrice() {
        // Arrange
        Product laptop = new Product.Builder()
                .price(new BigDecimal("1000"))
                .build();
        //Act
        // Skapa en liten konkret anonym version av den abstrakta ProductDecorator
        ProductDecorator decorator = new ProductDecorator(laptop) {};

        // Assert
        assertEquals(new BigDecimal("1000"), decorator.getPrice());
    }
}
