package src;

import java.util.Scanner;

public class SpaceWordDeletion {

	// return string array after removing space
	static String[] removeSpace(String inputSen) {
		String splitString[] = inputSen.split("\\s+");
		return splitString;

	}

	/// return string after deleting the word
	static String deleteWord(String[] strings, int pos, String word) {// delete word method definition
		String updatedString = "";
		for (int i = 0; i < strings.length; i++) {
			if (!(strings[i].equals(strings[pos]) && i == pos && strings[i].equals(word))) {
				updatedString += strings[i];
				updatedString += " ";
			}
		}

		return updatedString;
	}

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);

		System.out.println("Enter the String");
		String input = get.nextLine();
		System.out.println("Enter the element to be  deleted");
		String word = get.nextLine();
		System.out.println("Enter position of the element to be  deleted");
		int pos = get.nextInt();

		System.out.print(deleteWord(removeSpace(input), pos, word));// invoking deleteWord<-removeSpace<-input
		get.close();
	}
}
