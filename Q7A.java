//  Write a program to print the following outputs using for loops:

//  A
//  A B
//  A B C
//  A B C D
//  A B C D E

public class Q7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			char a ='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.print("\n");
		}
	}
}
