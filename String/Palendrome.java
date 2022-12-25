package String;

public class Palendrome {
	// Function=============================================================
	public static int isPalendrome(String str) {

		if (str.length() <= 1) {
			return 1;
		} else if (str.charAt(0) != str.charAt(str.length() - 1)) {
			return 0;
		}
		int result = isPalendrome(str.substring(1, str.length() - 1)); // Substring str.
		if (result == 1) {
			return 1; // "1" true if Palendrome
		} else {
			return 0; // "0" false if not Palendrome
		}

		// Main=================================================================
	}

	public static void main(String[] args) {
		String str = "axaa"; // Input
		int result = isPalendrome(str); // call Function and store it
		System.out.println(result); // Print
		// End==================================================================
	}
}