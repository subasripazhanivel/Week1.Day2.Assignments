package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrNum = { 3, 2, 11, 4, 6, 7 };

		/*
		 * Pseudo Code: 
		 * 1) Arrange the array in ascending order 
		 * 2) Pick the 2nd element from the last and print it
		 */
		Arrays.sort(arrNum);
		System.out.println("\n\nSecond Largest element is : " + arrNum[arrNum.length - 2]);
	}

}
