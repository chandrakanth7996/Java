package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(3);
		list.add(54);
		list.add(1);
		list.add(2);
		list.add(-9);
		
		Collections.sort(list); 
		
		System.out.println(list); // [-9, 1, 2, 3, 12, 54]
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list); // [54, 12, 3, 2, 1, -9]

	}

}
