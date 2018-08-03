package src;

import java.util.*;

//check ArmstrongNumber
public class checkArmstrong {
	/* returns sum of cube of each number */
	static int ArmStrongCheck(int output) {
		int sum = 0; // Local Variable
		while (output > 0) {
			int cube = 0, number = 0;
			number = output % 10;
			cube = number * number * number;
			sum += cube;
			output /= 10;
		}
		return sum;
	}

	public static void main(String a[]) {
		Scanner get = new Scanner(System.in);
		int input;// Local Variable
		input = get.nextInt();
		get.close();

		// Invoking ArmStrongCheck method of class
		if (ArmStrongCheck(input) == input)// check whether the input value is same as the value returned by the method
			System.out.print("Given Number is an Armstrong number");
		else
			System.out.print("Given Number is not an Armstrong number");
	}
}