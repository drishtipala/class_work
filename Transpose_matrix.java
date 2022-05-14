package assignment_work;

import java.util.Scanner;

public class Transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int i,j;
		System.out.print("Enter numbers:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = sc.nextInt();
				System.out.print(" ");
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				
				System.out.print(a[i][j] + " ");
			}
			System.out.print(" ");
		}
		System.out.println("Transpose of matrix are:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[j][i]);
			}
			System.out.print(" ");
		}

	}

}
