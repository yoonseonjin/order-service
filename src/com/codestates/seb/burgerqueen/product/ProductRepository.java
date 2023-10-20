package com.codestates.seb.burgerqueen.product;

import com.codestates.seb.burgerqueen.product.subproduct.Drink;
import com.codestates.seb.burgerqueen.product.subproduct.Hamburger;
import com.codestates.seb.burgerqueen.product.subproduct.Side;

public class ProductRepository {
	private final Product[] products = {
		new Hamburger(1, "새우버거", 3500, 500, false, 4500),
		new Hamburger(2, "치킨버거", 4000, 600, false, 500),
		new Side(3, "감자튀김", 1000, 300, 1),
		new Side(4, "어니언링", 1000, 300, 1),
		new Drink(5, "코카콜라", 1000, 200, true),
		new Drink(6, "제로콜라", 1000, 0, true)
	};
}
