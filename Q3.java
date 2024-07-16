//  WAP to enter the first number and second number. Display the prime numbers between the 
//  first and second number.


import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no.");
		a=sc.nextInt();
		System.out.println("Enter Second no.");
		b=sc.nextInt();
		System.out.println("Prime no b/w "+a+" and "+b+" are");
		for(;a<=b;a++)
		{
		int flag=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;		
			}
		}
		if(flag==0)
			System.out.println(a+"");

	  }
	}

}
