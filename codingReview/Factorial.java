package codingReview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=num; i++)
		{
			fact *=i;
		}
		System.out.println("Factorial of " +  num  + " is: " + fact);
	}

}
