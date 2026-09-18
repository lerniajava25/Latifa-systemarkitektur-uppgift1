package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // Create Product using Builder
      Product product = new Product.Builder()
                .id("id1")
                .name("SuperWidget")
                .category(Product.Category.TOOLS)
                .rating(8)
                .dateCreated(LocalDate.now())
                .dateUpdated(LocalDate.now())
                .price(new BigDecimal("1000"))
                .build();

    }

        }
