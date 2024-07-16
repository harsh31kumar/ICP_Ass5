//  WAP to calculate and display the factorial of all numbers between m and n 
//  (where m < n, m > 0, n > 0)


import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);
	        System.out.print("Enter m: ");
	        int m = sc.nextInt();
	        System.out.print("Enter n: ");
	        int n = sc.nextInt();
	        if (m < n && m > 0 && n > 0) {
	            for (int i = m; i <= n; i++) {
	                long fact = 1;
	                for (int j = 1; j <= i; j++)
	                    fact *= j;
	                System.out.println("Factorial of " + i + " = " + fact);
	            }
	        }
	        else {
	            System.out.println("Invalid Input");
	        }
	}

}

