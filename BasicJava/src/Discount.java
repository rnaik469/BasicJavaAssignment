package src;

import java.util.Scanner;

public class Discount {
	// return discounted price
	static double calcDiscount(double price) {
		double newprice = .35 * price;
		return price - newprice;
	}

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);

		System.out.println("Enter the Price");
		double price = get.nextDouble();

		System.out.println("Actual Price" + price + ".\n Price after discount " + calcDiscount(price));// invoking
																										// calcDiscount
		get.close();
	}
}
