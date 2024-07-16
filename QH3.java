//  Write a java program to evaluate the function sin(x) as defined by the infinite series expansion.
//  sin (x) = x - x^3/3! + x^5/5! - x^7/7!+    +.............
//  The acceptable error for computation is 10^-6


import java.util.Scanner;
public class QH3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		x=sc.nextInt();
		double term =x;
		double sum=term;
		int i=3;
		double error =0.000001;
		while(Math.abs(term)>error)
		{
			term=(-1)*(term*(x*x))/((i-1)*i);
			sum=sum+term;
			i=i+2;
			
		}
		System.out.println("sin("+x+")="+sum);

	}

}
