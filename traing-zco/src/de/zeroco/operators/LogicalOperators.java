package de.zeroco.operators;

public class LogicalOperators {
	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println("The given two operands are true" + ":" + isGivenTwoConditionsAreTrue(false, false));
		System.out.println(isGivenAnyConditionIsTrue(true, false));
		System.out.println(isGivenConditionFalse(false));
	}

	public static boolean isGivenTwoConditionsAreTrue(boolean operandOne, boolean operandTwo) {
		return (operandOne && operandTwo) ;
	}
	
	public static boolean isGivenAnyConditionIsTrue(boolean operandOne, boolean operandTwo) {
		return (operandOne || operandTwo) ;
	}
	
	public static boolean isGivenConditionFalse(boolean operandOne) {
		return (!operandOne) ;
	}
}