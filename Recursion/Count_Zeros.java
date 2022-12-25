package Recursion;

public class Count_Zeros {

	public static int zero(int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 10) {
			return 0;
		}

		int que = n / 10;
		int rem = n % 10;

		int count = 0;
		if (rem == 0) {
			count = count + 1;
		}

		int result = count + zero(que);
		return result;
	}

	public static void main(String[] args) {
		int n = 10;
//		System.out.println(n);
		int result = zero(n);
		System.out.println(result);

	}

}
