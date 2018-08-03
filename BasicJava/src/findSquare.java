package src;

import java.util.*;

public class findSquare {
	// returns square of a number
	static int square(int output) {
		return output * output;
	}

	public static void main(String a[]) {
		Scanner get = new Scanner(System.in);
		int input;
		input = get.nextInt();
		get.close();

		System.out.print(square(input));// printing square using square()
	}
}