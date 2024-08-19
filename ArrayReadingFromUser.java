package JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReadingFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		// ways to access for loop
		for(int num : arr) {
			System.out.print(num+" "); 
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

/**
output: 
5
12 32 43 54 65
12 32 43 54 65 
[12, 32, 43, 54, 65]
12 32 43 54 65 
 */
