//  Write a program to print the following outputs using for loops:

//          1
//        2 2
//      3 3 3
//    4 4 4 4
//  5 5 5 5 5


public class Q7C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ;i<=5 ;i++)
		{
		
			for(int k=4;k>=i;k--)
			{
				System.out.print("   ");
			}
		
			for(int j=1;j<=i;j++)
			{
				System.out.print( i +"  ");
			}
			System.out.println("\n");
		}


	}

}