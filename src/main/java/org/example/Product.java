package org.example;

import java.time.LocalDate;

public class Product {
    public enum Category {
        TOOLS
    }

    // Product-fälten
    private String id;
    private String name;
    private Category category;
    private int rating;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;


    //Nested class Builder
    public static class Builder {
        // Builder-fälten
        private String id;
        private String name;
        private Category category;
        private int rating;
        private LocalDate dateCreated;
        private LocalDate dateUpdated;
    }

    //Origin produkt Konstruktorn -> private
    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.category = builder.category;
        this.rating = builder.rating;
        this.dateCreated = builder.dateCreated;
        this.dateUpdated = builder.dateUpdated;
    }


}
