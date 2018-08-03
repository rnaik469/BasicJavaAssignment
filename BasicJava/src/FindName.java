package src;

import java.util.Scanner;

public class FindName {
	static Scanner get = new Scanner(System.in);

	// return string array
	static String[] input() {
		int size;

		System.out.println("Enter size of Array");
		size = get.nextInt();

		String input[] = new String[size];
		for (int i = 0; i < size; i++) {
			input[i] = get.next();
		}
		return input;
	}

	// return name count
	static int searchName(String names[]) {// name search method definition

		int count = 0;

		System.out.println("Enter the Name You want to Search");
		String name = get.next();

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				count++;
			}
		}

		return count;
	}

	// prints found or not
	static void foundOrNot(int count) {// fount or not method definition
		if (count >= 0) {
			System.out.println("Name found and its occurence is: " + count);
		} else {
			System.out.println("Name not found! ");
		}

	}

	public static void main(String[] args) {
		foundOrNot(searchName(input()));// invoking foundOrNot<-searchName

	}

}
