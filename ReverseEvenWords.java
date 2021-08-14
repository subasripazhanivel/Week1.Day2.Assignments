package week1.day2.assignments;

/* Pseudo Code:

 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

 
*/
public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am learning core java for automation testing";
		String revStr = "";
		String[] splitStr = test.split(" ");
		System.out.println("Given String is :" + test);
		for (int i = 0; i < splitStr.length; i++) {
			if (i % 2 != 0) {
				for (int j = splitStr[i].length() - 1; j >= 0; j--) {
					revStr += splitStr[i].charAt(j);
				}

				test = test.replace(splitStr[i], revStr);
				revStr = "";
			}

		}

		System.out.println(test);
	}

}

