package demo;
import java.util.Scanner; 

public  class Cricket {
	public static void main(String[]args)
	{
int totalrun;
int four;
int six;
int totalboundaries;
int finalvalue;
double percentage;

Scanner scan = new Scanner(System.in);
System.out.println("enter total run");
totalrun=scan.nextInt();
System.out.println("enter number of four");
four=scan.nextInt();
System.out.println("enter number of six");
six=scan.nextInt();
totalboundaries=(4*four)+(6*six);
finalvalue=totalrun-totalboundaries;
percentage=(finalvalue*100/totalrun);
System.out.println(percentage);




	}
}