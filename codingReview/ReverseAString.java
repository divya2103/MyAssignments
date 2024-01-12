package codingReview;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		String revStr = "";
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		if (str != "") {
			for (int i = str.length() - 1; i >= 0; i--) {
				revStr = revStr + str.charAt(i);
				
			}
			System.out.println("Reversed String is: " + revStr);
		} else {
			System.out.println("Invalid input");
		}
	}

}
