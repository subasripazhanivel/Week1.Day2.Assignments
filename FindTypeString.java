package week1.day2.assignments;

public class FindTypeString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

	
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/
		
		char[] charArr = test.toCharArray();
		for (int i = 0; i <charArr.length; i++) {

			if (Character.isLetter(charArr[i])) {
				letter++;
			} else if (Character.isDigit(charArr[i])) {
				num++;
			} else if (Character.isSpaceChar(charArr[i])) {
				space++;
			} else {
				specialChar++;
			}
		}

		System.out.println("Given String is : " +test);
		System.out.println("Given string contatis: "+letter + " letters");
		System.out.println("Given String contatis: "+ space+ " space");
		System.out.println("Given String contatis: "+ num+ " number" );
		System.out.println("Given String contatis: "+ specialChar+ " special Charcter");

	}

}
