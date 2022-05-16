package array;

import java.util.Scanner;

public class arr_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  size,i,temp=0,j;
		System.out.print("Enter size of the array:");
		size = sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter " + size + " numbers:");	
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();		
		}	
		System.out.println("Numbers are:");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print(" ");
		System.out.println("\nThe numbers in ascending order are:");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}
