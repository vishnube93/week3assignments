package week3.day1assignment;

public class Palindrome {

	public static void main(String[] args) {
		// Build a logic to find the given string is palindrome or not
		// Declare A String value as"madam"
		String str = "madam";
		// Declare another String rev value as ""
		String rev = "";
		char[] charArray = str.toCharArray();
		// Iterate over the String in reverse order
		for (int i = charArray.length - 1; i >= 0; i--) {
			// Add the char into rev
			rev = rev + str.charAt(i);
		}
		// Compare the original String with the reversed String, if it is same then
		// print palinDrome
		// Hint: Use .equals or .equalsIgnoreCase when you compare a String
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is a Palindrome String");
		} else {
			System.out.println(str + " is not a Palindrome String");
		}

	}

}
