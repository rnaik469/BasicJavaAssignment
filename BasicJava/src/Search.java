package src;

import java.util.Scanner;

//searching a number
public class Search {
	static boolean check = false;// instance member

	// returns true if found else false
	static boolean search(int num, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				check = true;
				break;
			}
		}
		return check;
	}

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int arr[] = new int[15], number;

		System.out.print("Enter Elements of Array\n");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = get.nextInt();
		}

		System.out.print("Enter Number you want to search\n");
		number = get.nextInt();
		get.close();
		// print whether number found or not
		if (search(number, arr))// invoking search
			System.out.print("Number Found");
		else
			System.out.print("Number not Found");
	}
}
