package com.codestates.seb.burgerqueen.product.subproduct;

import com.codestates.seb.burgerqueen.product.Product;

public class Drink extends Product {
	private boolean isHasStraw;

	public Drink(int id, String name, int price, int kcal, boolean isHasStraw) {
		super(id, name, price, kcal);
		this.isHasStraw = isHasStraw;
	}

	public Drink(Drink drink) {
		super(drink.getName(), drink.getPrice(), drink.getKcal());
		this.isHasStraw = drink.isHasStraw();
	}

	public boolean isHasStraw() {
		return isHasStraw;
	}

	public void setIsHasStraw(boolean isHasStraw) {
		this.isHasStraw = isHasStraw;
	}
}
