package findSecondMin;

public class FindSecondMin {

	static int findMin(int[] arr) {
		if(arr.length > 0) {
			int min = arr[0];
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] < min)
					min = arr[i];
			}
			return min;
		}
		return -1;
	}
	
	static int findSecMin(int[] arr) {
		if(arr.length > 0) {
			int min = findMin(arr);
			int secMin = arr[0];
			for(int i = 1; i < arr.length; i++) {
				if(secMin > arr[i] && arr[i] > min)
					secMin = arr[i];
			}
			return secMin;
		}
		return -1;
	}
		
	public static void main(String[] args) {
		int[] arr = {6, 4, 3, 7, 2, 8, 6, 5};
		
		System.out.println(findMin(arr));
		System.out.println(findSecMin(arr));
	}

}
