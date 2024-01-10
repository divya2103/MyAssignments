package day2HomeAssignments;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		String originalNum = Integer.toString(number);
		String reversedNum = "";

		for (int tempNum = originalNum.length() - 1; tempNum >= 0; tempNum--) {
			reversedNum = reversedNum + originalNum.charAt(tempNum);

		}
		System.out.println("Reversed number is:" + reversedNum);
		if (originalNum.equals(reversedNum)) {
			System.out.println(originalNum + " is a Palindrome number");
		} else {
			System.out.println(originalNum + " is not a Palindrome number");
		}
	}
}
