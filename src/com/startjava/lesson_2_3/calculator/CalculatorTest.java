package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.println("The calculator is ready!");

		String answer = "yes";
		while(answer.equals("yes")) {
			System.out.print("Enter the first number");
			int firstNumber = scan.nextInt();
			calc.setFirstNumber(firstNumber);

			System.out.print("Enter the sign of the mathematical operation: ");
			char mathOperation = scan.next().charAt(0);
			calc.setMathOperation(mathOperation);

			System.out.print("Enter the second number");
			int secondNumber = scan.nextInt();
			calc.setSecondNumber(secondNumber);


			calc.calculate();

			do {
				System.out.print("Want to continue [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		}

		System.out.println("End of the program");
	}
}