package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProduct() {
        Product product = new Product(
                11,
                "Laptop",
                20,
                true,
                12.33
        );

        assertEquals(11, product.getId());
        assertEquals("Laptop", product.getName());
        assertEquals(20, product.getQuantity());
        assertTrue(product.isAvailable());
        assertEquals(12.33, product.getPrice(), 0.001);
    }
}