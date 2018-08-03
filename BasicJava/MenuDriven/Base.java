package MenuDriven;

import java.text.ParseException;
import java.util.Scanner;

public class Base {
	public static void main(String[] args) throws ParseException {
		Scanner get = new Scanner(System.in);
		int choice;

		System.out.println("1.Calculator\n2.Circle\n3.Rectangle\n4.Temprature\n5.Date\n6.Employee\n7.Customer");
		choice = get.nextInt();

		switch (choice) {
		case 1:
			float fisrtValue, secondValue;
			System.out.println("Enter two numbers");
			fisrtValue = get.nextFloat();
			secondValue = get.nextFloat();
			Calculator calc = new Calculator();// Instantiating the class
			calc.calculator(fisrtValue, secondValue);// invoking calculator
			break;
		case 2:
			float radius;
			System.out.println("Enter radius of circle");
			radius = get.nextFloat();

			Circle circ = new Circle();// Instantiating the class

			circ.areaCircle(radius);// invoking areaCircle
			circ.circumfOfCircle(radius);// invoking circumfOfCircle
			break;

		case 3:
			float length, breadth;
			System.out.println("Enter Length and Breadth of Rectangle");
			length = get.nextFloat();
			breadth = get.nextFloat();

			Rectangle rect = new Rectangle();// Instantiating the class

			rect.areaOfRect(length, breadth);// invoking areaOfRect
			rect.PeriOfRec(length, breadth);// invoking PeriOfRec
			break;

		case 4:
			int c;
			Temprature temp = new Temprature();// Instantiating the class

			System.out.println("1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius");
			c = get.nextInt();

			switch (c) {
			case 1:
				temp.celToFahr();// invoking celToFahr
				break;
			case 2:

				temp.FahrTocel();// invoking FahrTocel
				break;

			default:
				break;
			}
			break;

		case 5:
			DateConv date = new DateConv();// Instantiating the class
			break;

		case 6:
			EmployeeDetail emp = new EmployeeDetail();// Instantiating the class
			break;

		case 7:
			CustomerDetail cus = new CustomerDetail();// Instantiating the class
			break;

		default:
			break;
		}
		get.close();
	}
}
