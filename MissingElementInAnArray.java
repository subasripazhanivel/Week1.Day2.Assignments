package week1.day2.assignments;

import java.util.Arrays;


// Sort the array

// loop through the array (start i from arr[0] till the length of the array)

// check if the iterator variable is not equal to the array values respectively

// print the number

// once printed break the iteration

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 7, 6, 8 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (arr[i] == j) {
				System.out.println(j);

				break;

			}

		}
	}

}
