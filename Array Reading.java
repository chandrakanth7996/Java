package JavaPrograms;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[5];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

/*
 * output:
5
12 23 45 43 32
12 23 45 43 32 
 */


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}

//output:
5
98
90
97
87
76
98 90 97 87 76 
