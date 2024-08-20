package JavaPrograms;

public class BinarySearch {

	public static void main(String[] args) {
		
		int search = binary(); 
		System.out.println(search);
	}
	
	public static int binary() {
		int[] arr = {12,14,15,23,45,67,89};
		int target = 89;
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(target<arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	

}
