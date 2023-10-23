package com.codestates.seb.burgerqueen.discount.discountCondition;

import java.util.Scanner;

import com.codestates.seb.burgerqueen.discount.discountPolicy.DiscountPolicy;

public class KidDiscountCondition implements DiscountCondition {
	private boolean isSatisfied;
	private DiscountPolicy discountPolicy;

	public KidDiscountCondition(DiscountPolicy discountPolicy) {
		this.discountPolicy = discountPolicy;
	}

	public boolean isSatisfied() {
		return isSatisfied;
	}

	private void setSatisfied(boolean satisfied) {
		isSatisfied = satisfied;
	}

	public void checkDiscountCondition() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("나이가 어떻게 되십니까?");
		int input = Integer.parseInt(scanner.nextLine());

		setSatisfied(input < 20);
	}

	public int applyDiscount(int price) {
		return discountPolicy.calculateDiscountedPrice(price);
	}
}
