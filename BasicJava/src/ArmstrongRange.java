package src;

// ArmstrongRange.java to check Armstrong between 100 and 999
public class ArmstrongRange {
	/* returns sum of cube of each number */
	static int ArmStrongCheck(int output) {
		int sum = 0;
		while (output > 0) {// start of while loop
			int cube = 0, number = 0;
			number = output % 10;
			cube = number * number * number;// finding cube of each number
			sum += cube;
			output /= 10;
		}
		return sum;// returns sum
	}

	public static void main(String a[]) {
		System.out.println("Armstrong Numbers between 100 and 999 are");
		for (int i = 100; i <= 999; i++) {// for loop to check
			if (ArmStrongCheck(i) == i)// ArmStrongCheck method call
				System.out.println(i);// priting every armstrong number between 100 to 999
		}

	}
}