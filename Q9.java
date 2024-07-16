//  Write a program that will read the value of n from the user and calculate sum of the following 
//  series:


import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		n=sc.nextInt();
		double sum=0;
		for(int i=1 ;i<=n;i++)
		{
			sum=sum+1.0/(i*i);
		}
		System.out.println("The total sum of the series is : "+sum);
	}
}
