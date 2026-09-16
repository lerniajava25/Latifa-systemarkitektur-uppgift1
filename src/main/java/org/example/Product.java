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

        //build() method for creating Product instances
        public Product build() {
            return new Product(this);
        }

        // Builder setter methods/Builder methods with method chaining
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Builder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder dateCreated(LocalDate dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder dateUpdated(LocalDate dateUpdated) {
            this.dateUpdated = dateUpdated;
            return this;
        }
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
        //Getter methods
        public String getId() {
        return id;
        }
        public String getName() {
        return name;
        }
        public Category getCategory() {
        return category;
        }
        public int getRating() {
        return rating;
        }
        public LocalDate getDateCreated() {
        return dateCreated;
        }
        public LocalDate getDateUpdated(){
        return dateUpdated;
        }
    }
