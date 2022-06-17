package constructor;

import java.util.Scanner;

public class Constructor_demo {
	
    int p,r,n,num,digit, sum = 0;
	static int a;
	static int b; 
    float simple_interest;
    Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_demo obj = new Constructor_demo();
		Constructor_demo obj1 = new Constructor_demo(a);
		Constructor_demo obj2 = new Constructor_demo(a,b);
	}
	//Simple Interest
	public Constructor_demo()
	{
		System.out.print("Enter principal:" );
		p = sc.nextInt();
		System.out.print("Enter rate:");
		r = sc.nextInt();
		System.out.print("Enter number:");
		n = sc.nextInt();
		simple_interest = (float)p*r*n/100;
		System.out.println("Simple Interest is:" + simple_interest);
	}
	//Sum Of Digit
	public Constructor_demo(int a)
	{
		System.out.print("Enter the number: ");  
		num = sc.nextInt();  
		while(num > 0)  
		{  
		    //finds the last digit of the given number    
		    digit = num % 10;  
		    //adds last digit to the variable sum  
		    sum = sum + digit;  
		    //removes the last digit from the number  
		    num = num / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);  
		}

	//Greater between two number
     public Constructor_demo(int a,int b)
     {
    	System.out.print("Enter two numbers:\n");
    	a = sc.nextInt();
    	b = sc.nextInt();
    	if(a>b)
    	{
    		System.out.println(a+ " is greater than " +b);
    	}
    	else
    	{
    		System.out.println(b+ " is greater than " +a);
    	}
     }
}



