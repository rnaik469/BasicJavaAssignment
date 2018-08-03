package MenuDriven;

import java.util.Scanner;

public class Calculator {
	float fisrtValue, secondValue;

	// return sum of two numbers
	float Add(float fisrtValue, float secondValue) {
		return fisrtValue + secondValue;
	}

	// return subtraction of two numbers
	float Sub(float fisrtValue, float secondValue) {
		return fisrtValue - secondValue;
	}

	// return multiplication of two numbers
	float Mul(float fisrtValue, float secondValue) {
		return fisrtValue * secondValue;
	}

	// return division of two numbers
	float Div(float fisrtValue, float secondValue) {
		return fisrtValue / secondValue;
	}

	void calculator(float fisrtValue, float secondValue) {
		Scanner get = new Scanner(System.in);
		int choice = 0;

		System.out.println("Select any \n1.Addition\n2.Subtraction\n3.Multipication\n4.Division");
		choice = get.nextInt();

		switch (choice) {
		case 1: {
			System.out.println(fisrtValue + "+" + secondValue + "=" + Add(fisrtValue, secondValue));// Invoking Add
		}

			break;

		case 2: {
			System.out.println(fisrtValue + "-" + secondValue + "=" + Sub(fisrtValue, secondValue));// Invoking Sub
			;
		}
			break;
		case 3: {
			System.out.println(fisrtValue + "*" + secondValue + "=" + Mul(fisrtValue, secondValue));// Invoking Mul
		}

			break;
		case 4: {
			System.out.println(fisrtValue + "/" + secondValue + "=" + Div(fisrtValue, secondValue));// Invoking Sub
		}

			break;

		default: {
			System.out.println("Invalid Option");
		}
			break;
		}
	}
}
