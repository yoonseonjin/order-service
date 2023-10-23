package com.codestates.seb.burgerqueen;

import com.codestates.seb.burgerqueen.discount.Discount;

public class Order {
	private Cart cart;
	private Discount discount;

	public Order(Cart cart, Discount discount) {
		this.cart = cart;
		this.discount = discount;
	}

	public void makeOrder() {
		int totalPrice = cart.calculateTotalPrice();
		int finalPrice = discount.discount(totalPrice);

		System.out.println("주문이 완료되었습니다.");
		System.out.println("주문 내역은 다음과 같습니다.");
		System.out.println("-".repeat(60));

		cart.printCartItemDetails();

		System.out.println("-".repeat(60));
		System.out.printf("금액 합계 : %d원\n", totalPrice);
		System.out.printf("할인 적용 금액 : %d원\n", finalPrice);
	}
}
