package MenuDriven;

import java.util.Scanner;

public class Temprature {
	double celsius, fahr;// local variable
	Scanner get = new Scanner(System.in);

	// converts celsius to Fahrenheit and print it
	void celToFahr() {
		System.out.println("Enter temprature in celsius");
		celsius = get.nextDouble();
		System.out.println("Celsius to Fahrenheit" + (1.8 * celsius + 32));
	}

	// converts Fahrenheit to celsius and print it
	void FahrTocel() {
		System.out.println("Enter Fahrenheit in celsius");
		fahr = get.nextDouble();
		System.out.print("Fahrenheit to Celsius" + ((fahr - 32) * (.555554)));
	}
}
