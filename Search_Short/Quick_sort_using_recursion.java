package Search_Short;

public class Quick_sort_using_recursion {
	public static int partition(int input[], int si, int ei) {
		int pivit_element = input[si];
		int smaller_num_count = 0;
		for (int i = si + 1; i <= ei; i++) {
			if (input[i] < pivit_element) {
				smaller_num_count++;
			}
		}
		int temp = input[si + smaller_num_count];
		input[si + smaller_num_count] = pivit_element;
		input[si] = temp;

		int i = si;
		int j = ei;
		while (i < j) {
			if (input[i] < pivit_element) {
				i++;
			} else if (input[j] >= pivit_element) {
				j--;
			} else {
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				j--;
				i++;
			}
		}
		return si + smaller_num_count;
	}

	// ---------------------------------------------
	public static void quick_sort(int input[], int si, int ei) {

		if (si >= ei) {
			return;
		}

		int pivit_index = partition(input, si, ei);
		quick_sort(input, si, pivit_index - 1);
		quick_sort(input, pivit_index + 1, ei);

	}

//---------------------------------------------------
	public static void hello(int input[]) {
		int si = 0;
		int ei = input.length - 1;
		quick_sort(input, si, ei);

	}

	// ----------------------------------------------------
	public static void main(String[] args) {
		int input[] = { 8, 8, 4, 5, 7, 8, 4, 5, 4, 5, 78 };
		hello(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
