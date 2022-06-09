package functions;

import java.util.Scanner;
public class Para_fun {

	public static void accept() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter the number:\n");
		num = sc.nextInt();
		armstrong_no(num);
		even_odd(num);
		pos_neg(num);
	}
	//To check whether the number is armstrong or not
	public static void armstrong_no(int a) {
		    int number,temp,total=0;
	        number = a;
	        while(number!=0)
	        {
	            temp = number % 10;
	            total = total+temp*temp*temp;
	            number = number / 10;
	        }
	        if(total == a)
	        {
	            System.out.println("Number is Armstrong");
	        }
	        else
	        {
	            System.out.println("Number is not Armstrong");
	        }  
	}
    public static int even_odd(int a) {
	        if(a%2==0)
	        {
	        	System.out.println("Number is even");
	        }
	        else {
	        	System.out.println("Number is odd");
	        }
	       return a;
    }
    public static void pos_neg(int a) {
    	if(a>=0)
    	{
    		System.out.println("Number is positve");
    	}
    	else {
    		System.out.println("Number is negative");
    	}

	}

}
