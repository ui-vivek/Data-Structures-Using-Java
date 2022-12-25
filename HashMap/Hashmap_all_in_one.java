package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hashmap_all_in_one {
	public static void maxf(int arr[]) { // make result 2
		HashMap<Integer, Integer> map = new HashMap<>();
		int max_size = 0;
		int max_ele = 0;
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i]) == false) {
				map.put(arr[i], 1);
			} else {
				int size = map.get(arr[i]);
				map.put(arr[i], ++size);
			}
		}

//			Set<Integer> keys = map.keySet();
//			for (Integer k : keys) {
//				System.out.println(k);
//				if (map.get(k) >= max_size) {
//					max_size = map.get(k);
//					max_ele = k;
//				}
//			}

		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) > max_size) {
				max_size = map.get(arr[i]);
				max_ele = arr[i];
			}
		}
		System.out.println(max_ele);
	}

	public static ArrayList<Integer> duplicate(int arr[]) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				continue;
			} else {

				map.put(arr[i], ++index);
			}
		}
		ArrayList<Integer> arl = new ArrayList<>();
		Set<Integer> keys = map.keySet();
		for (Integer e : keys) {
			arl.add(e);
		}
		return arl;
	}

	public static void firstcode() {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("hola", 2);
		map.put("sola", 2);
		map.put("pola", 3);

		System.out.println(map.size());
		System.out.println(map.containsKey("hola"));
		System.out.println(map.containsValue(2));
		System.out.println(map.isEmpty());
		System.out.println(map.get("sola"));
		map.remove("hola");

	}

	public static void large() {
		String str = "abba";
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {

			if (map2.containsKey(str.charAt(i))) {
				int size = map2.get(str.charAt(i));
				map2.put(str.charAt(i), ++size);
			} else {
				map2.put(str.charAt(i), 1);
			}

		}
		Set<Character> keys = map2.keySet();
		int max_value = 0;
		char max_char = ' ';
		for (Character s : keys) {
//				System.out.println(s + " " + map2.get(s));
			if (map2.get(s) > max_value) {
				max_value = map2.get(s);
				max_char = s;
			}
		}
		System.out.println("max char = " + max_char + " max value = " + max_value);

	}

	public static void inter() { // output----1 2 2
		int arr1[] = { 2, 6, 8, 5, 4, 3 };
		int arr2[] = { 2, 3, 4, 7 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				int size = map.get(arr1[i]);
				map.put(arr1[i], ++size);
			} else {
				map.put(arr1[i], 1);
			}
		}
//			for (int i = 0; i < arr2.length; i++) {
		//
//				if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
		//
//					System.out.println(arr2[i]);
//					int size = map.get(arr2[i]);
//					map.put(arr2[i], --size);
//				}
//			}

		HashMap<Integer, Integer> map2 = new HashMap<>();
		for (int i = 0; i < arr2.length; i++) {
			if (map2.containsKey(arr2[i])) {
				int size = map2.get(arr2[i]);
				map2.put(arr2[i], ++size);
			} else {
				map2.put(arr2[i], 1);
			}
		}

		Set<Integer> keys = map.keySet();
		for (Integer k : keys) {
			if (map2.containsKey(k)) {

				while (map.get(k) > 0 && map2.get(k) > 0) {
					System.out.println(k);
					int m1 = map.get(k);
					int m2 = map2.get(k);

					map.put(k, --m1);
					map2.put(k, --m2);

				}
			}
		}

	}

	public static void sum() {
		int arr[] = { 2, 1, -2, 2, 3, 2 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int size = map.get(arr[i]);
				map.put(arr[i], ++size);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(0 - (arr[i])) && map.get(0 - (arr[i])) > 0) {

			}
		}
	}

	public static void dupli() {

		String str = "kvievek";
		String str2 = "";
		HashMap<Integer, Character> map = new HashMap<>();
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (map.containsValue(str.charAt(i))) {
				continue;
			} else {
				map.put(++index, str.charAt(i));
			}
		}

		Set<Integer> keys = map.keySet();
		for (Integer i : keys) {
			str2 = str2 + map.get(i);
		}
		System.out.println(str2);

	}

	public static void sub() {
		int arr[] = { 15, 24, 23, 12, 19, 11, 16 }; // { 3, 7, 2, 1, 9, 8, 41 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(i + 1, arr[i]);
		}

		int start = 0;
		int end = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int count = 0;
			boolean isP = true;
			while (isP) {
				num = num + 1;
				if (map.containsValue(num)) {
					count++;

				} else {
					isP = false;
				}
			}
			if (count > max) {
				max = count;
				start = arr[i];
				end = num - 1;
			}
		}
		System.out.println("start = " + start + " end = " + end);

	}

	public static void sum_k() {
		int k = 3;
		int arr[] = { 5, 1, 2, 4 };
		HashMap<Integer, Integer> map = new HashMap<>();
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			map.put(++index, arr[i]);
		}
		Set<Integer> keys = map.keySet();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (Integer e : keys) {
				if (e == i + 1) {
					continue;
				}
				if (arr[i] - map.get(e) == k || map.get(e) - arr[i] == k) {
					count = count + 1;
				}
			}
			map.remove(i + 1);

		}
		System.out.println(count);
	}

	public static void main(String[] args) {
//			firstcode();
//			large();
		int arr[] = { 2, 3, 1, 1, 2, 3 };
//			ArrayList<Integer> arl = duplicate(arr);
//			System.out.println(arl);
//			maxf(arr);
//			inter();
//			dupli();
//			sub();
		sum_k();

	}
}