package JavaPrograms;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,14,15,23,42};
		int target = 12;
		int flag = 0;
		for(int i=0;i<arr.length;i++) {
			if(target == arr[i]) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}

}

// output : Found