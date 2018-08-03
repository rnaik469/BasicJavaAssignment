package src;

import java.util.ArrayList;
import java.util.Scanner;

public class sortPalinromes {
	// return array of String
	static String[] input() {
		Scanner get = new Scanner(System.in);
		String input[] = new String[10];
		System.out.println("Enter 10 elements in the array");
		for (int i = 0; i < 10; i++) {
			input[i] = get.next();
		}
		get.close();
		return input;
	}

	// return arraylist of palindromes
	static ArrayList<String> findPal(String input[]) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {

			StringBuilder rev = new StringBuilder(input[i]);
			rev = rev.reverse();
			String revtemp = rev.toString();

			if (input[i].equals(revtemp)) {
				al.add(input[i]);
			}
		}
		return al;
	}

	// return sorted array of palindromes using bubble sort
	static String[] sortPalin(ArrayList<String> al) {
		String temp;
		String palindromes[] = al.toArray(new String[al.size()]);
		for (int outer = 0; outer < palindromes.length - 1; outer++) {
			for (int inner = 0; inner < palindromes.length - outer - 1; inner++) {
				if ((palindromes[inner].length()) < (palindromes[inner + 1].length())) {
					temp = palindromes[inner];
					palindromes[inner] = palindromes[inner + 1];
					palindromes[inner + 1] = temp;
				}
			}
		}
		return palindromes;
	}

	// prints palindromes
	static void display(String output[]) {
		for (String out : output) {
			System.out.println(out);
		}
	}

	public static void main(String[] args) {

		display(sortPalin(findPal(input())));// invoking display <- sortPalin <- findPal <- input
	}
}
