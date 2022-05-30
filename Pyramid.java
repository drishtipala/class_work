package assignment_work;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j,k,row;
		System.out.print("Enter number of rows you want:");
		row = sc.nextInt();
		for(i=0;i<=row;i++)
		{
			for(j=row;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}	
			System.out.println(" ");
		}
	}
}
