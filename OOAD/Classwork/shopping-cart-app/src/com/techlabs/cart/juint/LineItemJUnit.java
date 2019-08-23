package com.techlabs.cart.juint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.cart.LineItem;
import com.techlabs.cart.Product;

class LineItemJUnit {
	Product product = new Product("1", "Book", 100, 50);
	LineItem item=new LineItem("1", 3, product);
	@Test
	void testProduct_ConstructorShouldAssignCorrectValues() {
		assertEquals("1", item.getId());
		assertEquals(3, item.getQauntity());
		assertEquals(product, item.getProduct());
	}

	@Test
	void testitemCost_ShouldReturnTotalCostOfLineItem() {
		assertEquals(150, item.itemCost());
	}
}
