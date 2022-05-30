package assignment_work;

import java.util.Scanner;

public class Positive_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,add=0;
		System.out.print("Enter two numbers:");
		while(true)
		{
			num = sc.nextInt();
			if(num<0)
		    break;
			add += num;
		}
		System.out.println("Addition is " +add);	
	}
}
