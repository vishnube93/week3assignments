package week3.day1assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Given string:");
		System.out.println(text);
		System.out.println("String after duplicates removed:");
		// Split the String into array and iterate over it
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			// Initialize an integer variable as count
			int count = 0;
			// Initialize another loop to check whether the word is there in the array
			for (int j = i + 1; j < split.length; j++) {
				// if it is available then increase the count by 1.
				if (split[i].equalsIgnoreCase(split[j])) {
					count++;
					split[j] = "0";
				}
				// if the count > 1 then replace the word as ""
				if (count > 1) {
					// Displaying the String without duplicate words
					System.out.print(text.replace(split[i], ""));
					break;
				}
			}
		}
	}
}
