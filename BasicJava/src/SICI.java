package src;

import java.util.*;

public class SICI {
	// returns Simple Interest
	static float SimpleInterset(float principal, float rate, float time) {
		return ((principal * rate * time) / 100);
	}

	// returns compound interest
	static float CompoundInterset(float principal, float rate, float time)// simple interest method definition
	{
		return ((principal * (float) (Math.pow((1 + (rate / 100)), time))) - principal);
	}

	public static void main(String a[]) {

		Scanner get = new Scanner(System.in);
		float p = 0, r = 0, t = 0;

		System.out.println("Enter Principal");
		p = get.nextFloat();
		System.out.println("Enter Rate of Interset");
		r = get.nextFloat();
		System.out.println("Enter Time period");
		t = get.nextFloat();

		System.out.println(SimpleInterset(p, r, t));// invoking SimpleInterset
		System.out.println(CompoundInterset(p, r, t));// invoking CompoundInterset

		get.close();

	}
}