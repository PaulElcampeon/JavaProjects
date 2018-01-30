package add2numbers;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter your first number");
		double firstNum = input.nextDouble();
		
		System.out.println("Enter your second number");
		double secondNum = input.nextDouble();
		
		double answer = firstNum + secondNum;
		
		System.out.println("Your answer is "+answer);
		
	}
}
