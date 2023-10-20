package com.codestates.seb.burgerqueen.product.subproduct;

import com.codestates.seb.burgerqueen.product.Product;

public class Hamburger extends Product {
	private boolean isBurgerSet;
	private int burgerSetPrice;

	public Hamburger(int id, String name, int price, int kcal, boolean isBurgerSet, int burgerSetPrice) {
		super(id, name, price, kcal);
		this.isBurgerSet = isBurgerSet;
		this.burgerSetPrice = burgerSetPrice;
	}

	public boolean isBurgerSet() {
		return isBurgerSet;
	}

	public void setIsBurgerSet(boolean isBurgerSet) {
		this.isBurgerSet = isBurgerSet;
	}

	public int getBurgerSetPrice() {
		return burgerSetPrice;
	}

	public void setBurgerSetPrice(int burgerSetPrice) {
		this.burgerSetPrice = burgerSetPrice;
	}
}
