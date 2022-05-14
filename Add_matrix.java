package assignment_work;

import java.util.Scanner;

public class Add_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int i,j,add;
		System.out.print("Enter numbers:\n");	
		for(i=0;i<2;i++)
		{	
			for(j=0;j<2;j++)
			{
			    a[i][j]=sc.nextInt();
			    b[i][j]=sc.nextInt();
			    add = a[i][j] + b[i][j];
			}
		}
	    System.out.print("Addition of Array Elements are:");	
	    for(i=0;i<2;i++)
	    {
	    	for(j=0;j<2;j++)
	    	{
	           System.out.print(a[i][j] + b[i][j]+ "\t");
	    	}
	    }	
	}

}
