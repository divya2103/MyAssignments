package codingReview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if (isPrime(num)) {
			System.out.println("True");
		}

		else {
			System.out.println("False");
		}

	}

	public static boolean isPrime(int number) {
		boolean prime = false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				prime = true;
				break;
			}

		}
		return prime == false;
	}

}
