package Recursion;

public class Sum_of_digits {
	public static int sum(int n) {
		if (n <= 0) {
			return 0;
		}
		int que = n / 10;
		int rem = n % 10;

		int result = rem + sum(que);
		return result;
	}

	public static void main(String[] args) {
		int n = 1099;
		int result = sum(n);
		System.out.println(result);
	}

}
