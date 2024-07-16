//  Write a program to print the following outputs using for loops:

//  1 
//  2 3
//  4 5 6
//  7 8 9 10
//  11 12 13 14 15


public class Q6C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		for(int i=1 ;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+a+" ");
				a++;
			}
			System.out.print("\n");
	    }
	}
}
