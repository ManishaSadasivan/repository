package demo;
import java.util.Arrays;
import java.util.Collections; 

public class Max {
	
	
		 static int arr[] = {1,2,2}; 
		 static int max,temp;
		
		static int largest() 
		{ 
			int i;
			
			 max = arr[0]; 
			
			
			for (i = 1; i < arr.length; i++) 
				if (arr[i] > max) 
					max = arr[i]; 
			
			return max; 
		
		} 
		static int product()
		{
			int x,y;
			temp=0;
			for(x=1;x<arr.length;x++)
				for(y=x+1;y<arr.length;y++)
				temp=arr[x]*arr[y];
			return temp;
		}
		
		// Driver method 
		public static void main(String[] args) 
		{ 
			if(max==temp)
			{
				System.out.println(largest());
			}
			else
			{
				System.out.println("1");
			}
	          
			System.out.println("Largest in given array is " + largest()); 
			System.out.println("product"+product());
	} 
}

	
	

