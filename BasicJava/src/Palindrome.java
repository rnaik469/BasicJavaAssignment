package src;

import java.util.Scanner;

public class Palindrome {
	// return true if number is palindrome
	static String check_palindrome() {
		String set;
		Scanner get = new Scanner(System.in);

		int input;
		System.out.print("Enter Any number");
		input = get.nextInt();
		get.close();
		int check = input, reverse = 0;
		while (input > 0) {
			int temp = input % 10;
			reverse = reverse * 10 + temp;
			input /= 10;

		}

		if (reverse == check) {
			set = "True";
		} else
			set = "False";
		return set;

	}

	public static void main(String[] args) {
		System.out.print(check_palindrome());// invoking check_palindrome
	}
}
