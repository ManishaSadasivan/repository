package demo;
import java.util.Scanner; 
public class array {

	public static void main(String[]args) {
		int size;
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the arraysize");
		size=scan.nextInt();
		Integer arr[]= new Integer[size];
		System.out.println("enter the array");
		for(i=0;i<=size;i++) {
			arr[i]=scan.nextInt();
		
		}
		
	}

}
