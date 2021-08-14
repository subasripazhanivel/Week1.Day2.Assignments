package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test = "changeoddindextouppercase";
		String result= "";
		char oddindex;
				
		
		char[] charArr=test.toCharArray();
		
		for(int i=0;i<charArr.length;i++) {
			oddindex=test.charAt(i);
			
			if(i%2!=0) {
			oddindex=Character.toUpperCase(charArr[i]);
		
			}
			result+=Character.toString(oddindex);
			}
			
						
		System.out.println("\n\nConverted string is : "+result);
		
	}
	

}
