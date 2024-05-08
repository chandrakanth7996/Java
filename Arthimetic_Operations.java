package JavaCodingPrograms;

import java.util.Scanner;

public class Arthimetic_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum of two numbers is: "+(a+b));
		System.out.println("Subtraction of two numbers is: "+(a-b));
		System.out.println("Division of two numbers is: "+(a/b));
		System.out.println("Modulus of two numbers is: "+(a%b));
		System.out.println("PreIncrement of two numbers is: "+(++a + ++b));
		System.out.println("PostIncrement of two numbers is: "+(a++ + b++));
		System.out.println("PreDecrement of two numbers is: "+(--a + --b));
		System.out.println("PostDecrement of two numbers is: "+(a-- + b--));

	}

}
