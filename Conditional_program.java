package JavaCodingPrograms;

import java.util.Scanner;

public class Conditional_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 + " is greater than "+ num2);
		} else
			System.out.println(num2 + " is greater than "+ num1);

	}

}
