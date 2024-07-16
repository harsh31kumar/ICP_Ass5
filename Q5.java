//  WAP to display the multiplication table from 2 to 15.


import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=2; i<=15; i++)
		{
			for(int j=1; j<=10; j++){
		
		System.out.println(i+"x"+j+"="+(i*j));
		  }
		}
	}
}
