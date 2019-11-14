package demo;

import java.util.Scanner;

public class Threshold {

	public static void main(String[]args) {
		float borrow,si;
		int rate,amount,n;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter initial amount");
		borrow=scan.nextFloat();
		System.out.println("enter rate of intrest");
		rate=scan.nextInt();
		System.out.println("threshold");
		amount=scan.nextInt();
si=amount-borrow;
n=(int)((si*100)/(borrow*rate));
System.out.println(n);
	}

}
