//  Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in
//  the sequence are generated from the sum of their three most recent predecessors. Write a java
//  program to generate this sequence up to n terms where n > 3


import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		n=sc.nextInt();
		int a=0,b=1,c=1;
		System.out.println(a+" "+b+" "+c+" ");
		for(int i=4;i<=n;i++)
		{
			int d=a+b+c;
			System.out.print(d+" ");
			a=b;
			b=c;
			c=d;
		}
	}
}
