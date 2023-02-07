package week1.day2Assignment1;

public class IsPrime {
public static void main(String[] args) {
	boolean isPrime=true;
int input=13;
		for(int i=2;i<input;i++) {
		if(input%i==0) {
			System.out.println("The given number not a Prime Number " );
			isPrime=false;
			break;
		}
			
	}
	
	 if(isPrime) {
		 System.out.println("Its a prime");
	 }
		
		
		
		
		
		
		
		
		
		
		
		
		 
	
	
	/*
	int input = 103;
	boolean notPrimeFlag = false;
	for (int i = 2; i<=(input-1); i++)
	{
		if((input%i) == 0)
		{
		  notPrimeFlag = true;
		}
	}
	if (notPrimeFlag == false)
	 {
		 System.out.println("Input " + input + " is prime");
	 }
	 else
	 {
		 System.out.println("Input " + input + " is not prime");
	 }
	 */
	

	}
}
 


