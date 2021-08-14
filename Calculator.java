package week1.day2.assignments;


/*
 * Assignment #1: ( Class and Methods)
===========
--  Create a class "Calculator" with below methods
(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
(b) sub(int num1, int num2), it should return subtraction of of num1-num2
(c) mul(double num1, double num2), it should return product of num1 * num2
(d) divide(float num1, float num2), it should return division of num1 / num2

-- Create another class as MyCalculator and call all the methods from Calculator and print the results
 */


public class Calculator {

	public int add(int num1, int num2, int num3) {
		int sum = 0;
		sum = num1 + num2 + num3;
		return (sum);
	}

	public int sub(int num1, int num2) {
		int difference = 0;
		difference = num1 - num2;
		return (difference);
	}

	public double mul(double num1, double num2) {
		double product = 0;
		product = num1 * num2;
		return (product);
	}

	public float divide(float num1, float num2) {
		float div=0f;
		div = num1 / num2;
		return (div);
	}
}