package week1.day2.assignments;

/* Learnings :
 * 1.Creation of object with existing class.
 * 2. 2 ways of calling methods from another class
 * Type mismatch error when different data type is used from class Calculator 
 */

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator objMcal = new Calculator();

		// calling method from another class and printing result
		int addCal = objMcal.add(8, 6, 33);
		System.out.println("Sum of given numbers is :" + addCal);

		int subCal = objMcal.sub(44, 15);
		System.out.println("Subraction of given numbers is :" + subCal);

		double mulCal = objMcal.mul(2.5, 2.5);
		System.out.println("Product of given numbers is :" + mulCal);

		float divCal = objMcal.divide(33.0f, 11.0f);
		System.out.println("Division of given numbers is :" + divCal);
		

		// other way of calling method and printing result
		System.out.println("\n");
		System.out.println("Addition result is : " + objMcal.add(8, 6, 33));
		System.out.println("Subraction Resutl is : " + objMcal.sub(22, 10));
		System.out.println("Multiplication Result is : " + objMcal.mul(2.8, 11.33));
		System.out.println("Division Result is : " + objMcal.divide(33.6f, 11.6f));

	}

}
