package de.zeroco.operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println(sumOfTwoNumbers(11, 28));
		System.out.println(susbstractionOfTwoNumbers(23, 11));
		System.out.println(multiplicationOfTwoNumbers(11, 11));
		System.out.println(divisionOfTwoNumbers(190, 10));
		System.out.println("hi");
		System.out.println("hi");
	}
	
	public static int sumOfTwoNumbers(int firstNum, int secondNum) {
		return firstNum + secondNum;		
	}
	
	public static int susbstractionOfTwoNumbers(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}
	
	public static int multiplicationOfTwoNumbers(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}
	
	public static int divisionOfTwoNumbers(int firstNum, int secondNum) {
		return firstNum / secondNum;
	}
}
