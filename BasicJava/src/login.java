package src;

import java.util.Scanner;

public class login {
	// prints whether user is valid or not
	static void loginValidate(String uName, String uPass) {
		Scanner get = new Scanner(System.in);

		int InvalidCount = 1;
		String UNm = null, Upas = null;

		while (InvalidCount <= 3) {
			System.out.println("\nEnter Your Username");
			UNm = get.next();
			System.out.println("\nEnter Your Password");
			Upas = get.next();
			get.close();
			if (UNm.equals(uName) && Upas.equals(uPass)) {
				System.out.print("Welcome " + uName);
				break;
			} else {
				InvalidCount++;
			}
			if (InvalidCount > 3) {
				System.out.print(UNm + ", You have reached Maximum Number of Attempts\nContact Admin!!!!");
				break;
			} else {
				System.out.print("Invalid Username Or Password");
			}

		}

	}

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		String Username = null, password = null;// local variable

		System.out.println("Enter Your Username");
		Username = get.next();
		System.out.println("Enter Your Password");
		password = get.next();

		get.close();

		System.out.println("Registration Complete...\nNow Use Your Credential to login");
		loginValidate(Username, password);// invoking loginValidate
	}
}
