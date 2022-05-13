package assignment_work;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b,c,num;
		System.out.println("Enter A Number"); 
        num =sc.nextInt(); 
        b=1; 
        c=0; 
         while(b<= num) 
            { 
                if((num%b)==0) 
                   c=c+1; 
                   b++; 
            } 
             if(c==2) 
             System.out.println(num +" is a prime number"); 
             else 
             System.out.println(num +" is not a prime number"); 
   
	}
}
