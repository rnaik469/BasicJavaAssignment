package src;

import java.util.Scanner;

public class MissingNumber {
	// return string array
	static int[] input() {
		Scanner get = new Scanner(System.in);
		int n;

		System.out.println("Enter size of List");
		n = get.nextInt();

		int input[] = new int[n];
		System.out.println("Enter elements in the array starting from 0,1,2,.....N");

		for (int i = 0; i < n; i++) {
			input[i] = get.nextInt();
		}
		get.close();
		return input;
	}

	// return missing number
	static int findMisNo(int arr[]) {
		int sum = 0, N = arr.length;
		N += 1;

		int actSum = (N * (N - 1)) / 2;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return actSum - sum;
	}

	public static void main(String[] args) {
		int number = findMisNo(input());// invoking findMisNo
		System.out.print("Missing Number is:" + number);
	}
}
