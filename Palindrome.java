package week1.day2.assignments;

public class Palindrome {
	
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MADAM";
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);

		}
		if (str.equals(revStr)) {

			System.out.println("Given string " + str + " is Palindrome");

		} else {
			System.out.println("Given string " + str + " is not Palindrome");

		}
		System.out.println("\nReversed string is : " + revStr);
	}

}
