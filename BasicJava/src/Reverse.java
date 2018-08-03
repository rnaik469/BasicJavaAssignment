package src;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		String input = get.nextLine();
		get.close();
		String arr[] = input.split(" ");

		for (int i = 0; i < arr.length; i++) {
			StringBuilder rev = new StringBuilder(arr[i]);// conversion of input string to string builder
			rev = rev.reverse();// reverse the converted string using reverse method
			System.out.print(rev + " ");
		}
	}
}
