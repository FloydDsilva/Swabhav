package com.techlabs.cart.juint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.cart.Product;

class ProductJUintTest {
	
	Product product = new Product("1", "Book", 100, 70);
	@Test
	void testProduct_ConstructorShouldAssignCorrectValues() {
		assertEquals("1", product.getId());
		assertEquals("Book", product.getName());
		assertEquals(100, product.getCost());
		assertEquals(70, product.getDiscountPercent());
	}

	@Test
	void testfinalCost_ShouldReturnCorrectDiscountedCost() {
		assertEquals(30, product.finalCost());
	}
	
	
}
