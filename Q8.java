//  WAP to enter the value of n and display find the following sum of the series:
//  1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)


import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		n=sc.nextInt();
		int sum=0;
		for(int i=1 ;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			sum+=j;
		}
		System.out.println("The sum of the value of the "+i+"yh row :"+sum);
	}
	System.out.println("The total um of the series : "+sum);
	}
}
