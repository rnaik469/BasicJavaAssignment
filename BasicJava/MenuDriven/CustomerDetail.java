package MenuDriven;

import java.util.Scanner;

public class CustomerDetail {
	public CustomerDetail() {
		Scanner get = new Scanner(System.in);
		String name, mobNo, address, email;// local variable

		System.out.println("Enter following details of Customer \nEnter Customer Name");
		name = get.next();
		System.out.println("Enter Customer Email");
		email = get.next();
		System.out.println("Enter Customer Phone No.");
		mobNo = get.next();
		System.out.println("Enter Customer Address");
		address = get.next();

		// printinf details of Customer details
		System.out.println("Customer details are:");
		System.out.println("Customer Name	" + name);
		System.out.println("Customer Email " + email);
		System.out.println("Customer Phone No. " + mobNo);
		System.out.println("Customer Address " + address);
		get.close();

	}
}
