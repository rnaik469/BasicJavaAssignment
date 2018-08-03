package MenuDriven;

import java.util.Scanner;

public class EmployeeDetail {
	// EmployeeDetail constructor
	public EmployeeDetail() {
		Scanner get = new Scanner(System.in);
		String name, mobNo, address, email, empid;// local variable

		System.out.println("Enter following details of Employee \nEnter Employee Name");
		name = get.next();
		System.out.println("Enter Employee ID");
		empid = get.next();
		System.out.println("Enter Employee Email");
		email = get.next();
		System.out.println("Enter Employee Phone No.");
		mobNo = get.next();
		System.out.println("Enter Employee Address");
		address = get.next();

		// printing Employee Details
		System.out.println("Employee details are:");
		System.out.println("Employee Name	" + name);
		System.out.println("Employee ID " + empid);
		System.out.println("Employee Email " + email);
		System.out.println("Employee Phone No. " + mobNo);
		System.out.println("Employee Address " + address);

		get.close();
	}
}
