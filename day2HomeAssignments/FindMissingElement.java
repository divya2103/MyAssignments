package day2HomeAssignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] input = { 1, 4, 3, 2, 8, 6, 7 };
		int output;
		Arrays.sort(input);
		for (int i = 0; i <= input.length; i++) {
		output=i+1;
		if(input[i] != output)
			{
				System.out.println("Missing element is: " + output);
				break;
			}

			}
		

		}

	
}
