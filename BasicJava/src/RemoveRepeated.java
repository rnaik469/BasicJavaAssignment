package src;

import java.util.Scanner;

public class RemoveRepeated {

	// return String after removing repeating character
	String removeDuplicate(String inputString) {
		String updatedString = "";
		for (int i = 0; i < inputString.length(); i++) {
			char Char = inputString.charAt(i);
			if (Char != ' ') {
				// Concat character in string where character is not ' '(Singlr space)
				updatedString += Char;
			} // After Adding replace that character with space
			inputString = inputString.replace(Char, ' ');
		}

		return updatedString;
	}

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		// RemoveRepeated class object created
		RemoveRepeated remove = new RemoveRepeated();
		System.out.println("Enter any String");
		String inputString = get.next();
		// removeDuplicate method call
		System.out.print("\"" + remove.removeDuplicate(inputString) + "\""
				+ " after removing duplicate characters of String: " + inputString);
		get.close();
	}
}
