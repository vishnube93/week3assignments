package week3.day1assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// Declare String Input
		String test = "changeme";
		// Convert the String to character array
		char[] charArray = test.toCharArray();
		// Traverse through each character (using loop)
		for (int i = 0; i < charArray.length; i++) {
			// Find the odd index within the loop (use mod operator)
			// within the loop, change the character to uppercase, if the index is odd else
			// don't change
			if (i % 2 == 0) {
				System.out.print(charArray[i]);
			} else {
				System.out.print(Character.toUpperCase(charArray[i]));
			}
		}
	}

}
