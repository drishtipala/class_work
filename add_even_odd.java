package assignment_work;

import java.util.Scanner;

public class add_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,sum;
		System.out.print("Enter first number:\n");
		a = sc.nextInt();
		System.out.print("Enter second number:\n");
		b = sc.nextInt();
		if((a&b)%2==0)
		{
			sum =a +b;
			System.out.println("Addition of two even numbers is :" + sum);
		}
		else
		{
			sum = a + b;
			System.out.println("Addition of two odd numbers is:" + sum);
		}
		
		

	}

}
