package String;
public class Reverse {
	public static String reverse(String str) {
		if (str.length() <= 0) {
			return str;
		}
		String sub_str = reverse(str.substring(1));
		return sub_str + str.charAt(0);
	}

	public static void main(String[] args) {
		String str="vivek singh";
		String reversed_str = reverse(str);
		System.out.println(reversed_str);
	}
}
