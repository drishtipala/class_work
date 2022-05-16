package functions;

import java.util.Scanner;

public class Swapping_no {
	int a,b,c;
    Scanner sc = new Scanner(System.in);;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping_no obj = new Swapping_no();
		obj.swapping_with();
        obj.swapping_without();
	}
	public void swapping_with()
	{
	    System.out.print("Enter two numbers:\n");
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = a;
	    a = b;
	    b = c;
	    System.out.println("Numbers after swapping:"+a +" "+ b);
	    System.out.println();
	}
	public void swapping_without()
	{
	    System.out.print("Enter two numbers:\n");
	    a = sc.nextInt();
	    b = sc.nextInt();
	    a = a + b;
	    b = a - b;
	    a = a - b;
	    System.out.println("Numbers after swapping:"+a + " " + b);
	}	
}
