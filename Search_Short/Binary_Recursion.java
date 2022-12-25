package Search_Short;

public class Binary_Recursion {

	// Function=============================================================
	public static int binary(int arr[], int start, int end, int find_x) {
		if (start > end) {
			System.out.println("The number is not present in the array.");
			return -1;
		}
		int mid_index = (start + end) / 2;
		if (arr[mid_index] == find_x) {
			System.out.println("The number is preset at index : ");
			return mid_index;
		} else if (arr[mid_index] > find_x) {
			return binary(arr, start, mid_index - 1, find_x);
		} else {
			return binary(arr, mid_index + 1, end, find_x);
		}
		// Main=================================================================
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int result = binary(arr, 0, arr.length - 1, 7);
		System.out.println(result);

		// End==================================================================
	}
}