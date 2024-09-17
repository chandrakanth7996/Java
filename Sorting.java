package JavaPrograms;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {32,53,5432,456,54};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" "); // 32 53 54 456 5432 
		}	
	}

}


// 2nd way of sorting using Arrays
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       int[] arr = {1,3,4,2,2,7};
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
    }
}

// output : [1, 2, 2, 3, 4, 7]
