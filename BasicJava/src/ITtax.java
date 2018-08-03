package src;

import java.util.*;

//ITtax.java to calculate tax
public class ITtax {
	// return salary after deducting tax
	static float calcTax(float sal) {
		float tax = 0;
		if (sal > 0f && sal < 180000f)
			tax = 0;
		else if (sal >= 181001f && sal < 300000f)
			tax = 20;
		else if (sal >= 300001f && sal < 500000)
			tax = 20;
		else if (sal >= 500001f && sal < 1000000f)
			tax = 30;
		return tax * sal / 100;
	}

	public static void main(String a[]) {

		Scanner get = new Scanner(System.in);
		long salary;// local variable

		System.out.println("Enter the salary");
		salary = get.nextLong();

		System.out.println(calcTax(salary));// printing salary after tax deduction by invoking salary method
		get.close();
	}
}