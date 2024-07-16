//  WAP to check whether a number is twisted prime or not. Twisted prime is a number if the 
// number and its reverse both are prime then it is called twisted prime.


import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a prime no.");
		Num=sc.nextInt();
		int newNum=0, n1=Num;
		while(n1!=0)
		{
			int d=n1%10;
			newNum=newNum*10+d;
			n1=n1/10;
		}
		int flag=0;
		for(int i=2;i<newNum;i++)
		{
			if(newNum%i==0)
			{
				flag=1;
				break;		
			}
		}
		if(flag==0)
			System.out.println(Num+" is twisted prime no.");
	
	else
	
		System.out.println(Num+" is not twisted prime no.");

	}

}
