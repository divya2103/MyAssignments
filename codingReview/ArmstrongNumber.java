package codingReview;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		if (armstrongNumber(number)) {
			System.out.println("True");
		}

		else {
			System.out.println("False");
		}
	}

	public static boolean armstrongNumber(int num) {
		int result = 0, rem;
		int orgNum = num;
		while (orgNum != 0) {
			rem = orgNum % 10;
			result += Math.pow(rem, 3);
			orgNum /= 10;

		}
		return result == num;
	}

}