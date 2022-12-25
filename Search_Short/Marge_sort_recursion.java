package Search_Short;

public class Marge_sort_recursion {

	public static void marge(int arr1[], int arr2[], int arr3[]) {
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			} else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
	}

	public static void devide_arr(int arr[]) {
		if (arr.length <= 1) {
			return;
		}
		int mid = arr.length / 2;
		int arr1[] = new int[mid];
		int arr2[] = new int[arr.length - mid];

		for (int i = 0; i < mid; i++) {
			arr1[i] = arr[i];
		}
		for (int i = mid; i < arr.length; i++) {
			arr2[i - mid] = arr[i];
		}

		devide_arr(arr1);
		devide_arr(arr2);
		marge(arr1, arr2, arr);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 9, 11, 7, 12, 6, 13, 5, 14, 4, 15, 3, 16, 2, 17, 1, 18, 0, 19, -1, 20 };
		devide_arr(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}