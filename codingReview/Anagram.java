package codingReview;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the string2: ");
		String str2 = sc.nextLine();
		sc.close();

		if (str1.length() != str2.length()) {
			System.out.println("Not an Anagram");
		} else {
			char[] chString1 = str1.toCharArray();
			char[] chString2 = str2.toCharArray();

			Arrays.sort(chString1);
			Arrays.sort(chString2);

			if (Arrays.equals(chString1, chString2)) {
				System.out.println("Given words are Anangram");
			} else {
				System.out.println("Not an Anangram");
			}
		}
	}

}
