package de.zeroco.operators;

public class BitWiseOperators {
	public static void main(String[] args) {
		System.out.println(andBitWiseOperator(2, 3));
		System.out.println(orBitWiseOperator(4, 6));
		System.out.println(xorBitWiseOperator(6, 7));
		System.out.println(leftShiftBitWiseOperator(6));
		System.out.println(rightShiftBitWiseOperator(9));
		System.out.println("hi hello, i am 2nd");
		System.out.println("i am sample for pull erquest");
	}
	
	public static int andBitWiseOperator(int firstNum, int secondNum) {
		return firstNum & secondNum ;
	}
	
	public static int orBitWiseOperator(int firstNum, int secondNum) {
		return firstNum | secondNum ;
	}
	
	public static int xorBitWiseOperator(int firstNum, int secondNum) {
		return firstNum ^ secondNum ;
	}
	
	public static int leftShiftBitWiseOperator(int firstNum) {
		return firstNum << 2 ;
	}
	
	public static int rightShiftBitWiseOperator(int firstNum) {
		return firstNum >> 2 ;
	}
}
