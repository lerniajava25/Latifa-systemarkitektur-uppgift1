package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product implements Sellable {
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
    private BigDecimal price;


    //Nested class Builder
    public static class Builder {
        // Builder-fälten
        private String id;
        private String name;
        private Category category;
        private int rating;
        private LocalDate dateCreated;
        private LocalDate dateUpdated;
        private BigDecimal price;

        //build() method for creating Product instances
        public Product build() {
            if (price == null) {
                throw new IllegalStateException("Price is required");
            }

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

        public Builder price(BigDecimal price) {
            this.price = price;
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
            this.price = builder.price;
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
        public BigDecimal getPrice() {
            return price;
        }
    }
