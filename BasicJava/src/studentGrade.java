package src;

import java.util.*;

public class studentGrade {
	// returns student result
	static String check_result(float subject1, float subject2, float subject3) {
		String result = "";
		if (subject1 > 60 && subject3 > 60 && subject2 > 60) {
			result = "Passed";
		} else if (subject1 > 60 && subject2 > 60 || subject3 > 60 && subject2 > 60 || subject1 > 60 && subject3 > 60) {
			result = "Promoted";
		} else {
			result = "Failed";
		}
		return result;
	}

	public static void main(String a[]) {
		Scanner get = new Scanner(System.in);
		float subject1, subject2, subject3;

		System.out.println("Subject one marks");
		subject1 = get.nextFloat();
		System.out.println("Subject Two marks");
		subject2 = get.nextFloat();
		System.out.println("Subject Two marks");
		subject3 = get.nextFloat();

		System.out.println(check_result(subject1, subject2, subject3));// invoking check_result and printing it
		get.close();

	}
}