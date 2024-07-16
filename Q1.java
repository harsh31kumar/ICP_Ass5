//  Amicable numbers are pair of numbers each of whose divisors are added to give the other 
//  number.


import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter first no.");
		n1=sc.nextInt();
		System.out.println("Enter second no.");
		n2=sc.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<=n1;i++)
		{
			if(n1%1==0)
				sum1+=1;
		}	
		for (int j=1;j<=n2;j++)
		{ 
			if(n2%1==0)
				sum2+=1;	
		}
		if(sum1==n2  &&sum2==n1)
			System.out.println("Amicable");
		else
			System.out.println("Not Amicable");

	}

}
