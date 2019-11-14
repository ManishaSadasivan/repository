package demo;

import java.util.Scanner;

public class operation {

	public static void main(String[]args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter A");
		a=scan.nextInt();
		System.out.println("enter B");
		b=scan.nextInt();
		System.out.println("enter C");
		c=scan.nextInt();
		
		if(a+b==c)
		{
			System.out.println("add");
		}
		if(a-b==c)
		{
			System.out.println("subract");
		}
		if(a*b==c)
		{
			System.out.println("multiply");
		}
		if(a/b==c)
		{
			System.out.println("division");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
