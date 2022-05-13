package assignment_work;

import java.util.Scanner;

public class armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, count = 0, a, b, c, sum = 0;
		System.out.print("Enter a number:");
        n = sc.nextInt();
        a = n;
        c = n;
        while(a > 0)
        {
            a = a / 10;
            count++;
        }
        while(n > 0)
        {
            b = n % 10;
            sum = sum+b*b*b;
            n = n / 10;
        }
        if(sum == c)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }    	
	}
}
