//  Write a program to print the following outputs using for loops:

//  *
//  * *
//  * * *
//  * * * *
//  * * * * *


public class Q6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.print("\n");
		}

	}

}
