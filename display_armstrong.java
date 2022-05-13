package assignment_work;

public class display_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,i,s=0,num;
		for(i=1;i<=1000;i++)
		{
			num=i;
			s=0;
			while(num>0)
			{
				r=num%10;
				s=s+r*r*r;
				num=num/10;
			}
			if(i==s)
			{
				System.out.println(s);
			}
		}
		

	}

}
