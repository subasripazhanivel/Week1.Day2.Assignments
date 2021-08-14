package week1.day2.assignments;

public class CharOccuranceString {
	
	// declare and initialize a variable count to store the number of occurrences

	// convert the string into char array

	// get the length of the array

	// traverse from 0 till the array length

	// Check the char array has the particular char in it

	// if is has increment the count

	// print the count out of the loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";

		

		int count = 0;
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {

			if (charArr[i] == 'e')
				count++;

		}
		if (count > 0) {
			System.out.println("Letter e - No.of Occurance: " + count);

		}

	}
}
