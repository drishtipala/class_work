package assignment_work;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n;
	        System.out.println("Enter the number to display the factorial:\n ");
	        n = sc.nextInt();
	       int fact =1;
	        for(int i= n; i>=1; i--){
	            fact = fact*i;
	        }
	        System.out.println(fact);
	}
}
