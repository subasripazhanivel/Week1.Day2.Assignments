package week1.day2.assignments;

import java.util.Arrays;

/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		int count = 0;
		if (text1.length() == text2.length()) {
			char[] charArr1 = text1.toCharArray();
			char[] charArr2 = text2.toCharArray();
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			for (int i = 0; i < charArr1.length; i++) {
				if (charArr1[i] == charArr2[i]) {
					count++;

				}

			}
			if (count == text1.length()) {
				System.out.println("Given strings are an ANAGRAM");
			} else {
				System.out.println("Given strings are not ANAGRAM");
			}
		} else {
			System.out.println("Strings lengths are not equal and not an ANAGRAM");
		}
	}

}
