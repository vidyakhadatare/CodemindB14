package javapractices;

import java.util.Scanner;



public class PrimeNumber { 

	public static void main(String[] args) 
	
	
	{
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("please enter number to check Prime number...");

			int num=Integer.parseInt(scanner.next());
			
			boolean prime= false;
			for(int i=2;i<num/2;i++)
			{

if(num% i == 0) {
			prime = false;
			
}
if (num % i != 0 ) {
			
			prime = true;
			
			break;
}
if (num % i !=0) {
			prime= true;
			

			}
			
			if(prime)
				
				System.out.println("Given number is prime ");
			else
			System.out.println("Given number is not a prime");
			
}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	


	}
	
		
	

		
		
		
		
		
		
		
		
		

}

	
