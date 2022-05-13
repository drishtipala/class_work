package assignment_work;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,countPositive = 0, countNegative = 0,countZero = 0;
		char choice;
		do {			
		    System.out.print("Enter number:\n");
		    num = sc.nextInt();			
			if(num>0)
			{
				countPositive++;				
			}
			else if(num<0)
			{
				countNegative++;				
			}
			else
			{
				countZero++;				
			}		     
			System.out.print("Do you want to continue?:y/n");
			choice = sc.next().charAt(0);
		}while(choice == 'y' || choice == 'Y');
		{
			System.out.println("Positive Numbers:" + countPositive);
			System.out.println("Negative Numbers:" + countNegative);
			System.out.println("Zero Numbers:" + countZero);			
		}
	}
}
