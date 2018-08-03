package src;

import java.util.Scanner;

public class twoDSearch {
	// return 1 if element found else 0
	static int twoD_Search(String input[][], int inner, int outer) {

		Scanner get = new Scanner(System.in);
		System.out.print("Enter the Elements you want to search in the 2D array\n");
		String item = get.next();
		int stat = 0;

		for (int i = 0; i < outer; i++) {
			for (int j = 0; j < inner; j++) {
				if (item.equals(input[i][j])) {
					stat = 1;
				}
			}
		}
		return stat;

	}

	// return array of string
	static String[][] twoD_input(int inner, int outer) {
		int stat = 0;
		String input[][] = new String[outer][inner];
		Scanner get = new Scanner(System.in);
		for (int i = 0; i < outer; i++) {
			for (int j = 0; j < inner; j++) {
				input[i][j] = get.next();
			}
		}
		return input;

	}

	public static void main(String[] args) {
		System.out.print("Enter size of 2D array\n");
		Scanner get = new Scanner(System.in);
		int inner = get.nextInt(), outer = get.nextInt();
		System.out.print("Enter Elements of 2D array\n");

		int check = twoD_Search(twoD_input(inner, outer), inner, outer);// invoking t
		if (check == 1) {
			{
				System.out.print("Item Found");
			}
		} else
			System.out.print("No such element in the Array");
	}
}
