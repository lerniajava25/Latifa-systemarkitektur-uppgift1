package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
   void testId() {
        Product product = new Product.Builder()
                .id("id1")
                .build();

        assertEquals("id1", product.getId());
    }
    @Test
  void testName() {
        Product product = new Product.Builder()
                .name("SuperWidget")
                .build();
        assertEquals("SuperWidget", product.getName());
  }
@Test
    void testCategory() {
        Product product = new Product.Builder()
                .category(Product.Category.TOOLS)
                .build();
        assertEquals(Product.Category.TOOLS, product.getCategory());
}
@Test
    void testRating() {
        Product product = new Product.Builder()
                .rating(8)
                .build();
        assertEquals(8, product.getRating());

}
@Test
    void testDateCreated() {
        LocalDate dateCreated = LocalDate.now();
        Product product = new Product.Builder()
                .dateCreated(dateCreated)
                .build();
        assertEquals(dateCreated, product.getDateCreated());
}
@Test
    void testDateUpdated() {
    LocalDate dateUpdated = LocalDate.now();
        Product product = new Product.Builder()
                .dateUpdated(dateUpdated)
                .build();
        assertEquals(dateUpdated, product.getDateUpdated());
}

}
