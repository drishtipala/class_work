package functions;

import java.util.Scanner;

public class Class_one {
	    //Greater than
		public static void GRT(){
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter two numbers:\n");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+ "is greater than" +num2);
		}
		else {
			System.out.println(num2+ "is greater than" +num1);
		}
		}
		//Sum of digit
		public static void sum() {
		Scanner sc = new Scanner(System.in);
		int num,digit, sum = 0;  
		System.out.print("Enter the number: ");  
		num = sc.nextInt();  
		while(num > 0)  
		{  
		//finds the last digit of the given number    
		digit = num % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		num = num / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);  
		}
		
		//Even_Odd
		public static void Even_Odd() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number:\n");
		num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is Odd");
		}
		
	}
}
