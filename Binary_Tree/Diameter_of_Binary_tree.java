package Binary_Tree;

import java.util.Scanner;

class diameter_bt<T> {
	T root;
	diameter_bt<T> left;
	diameter_bt<T> right;

	diameter_bt(T root) {
		this.root = root;
	}

}

public class Diameter_of_Binary_tree {

	public static int height(diameter_bt<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}

	public static int calculate_diameter(diameter_bt<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		int resultLeft = calculate_diameter(root.left);
		int resultRight = calculate_diameter(root.right);

		int height = leftHeight + rightHeight + 1;

		return Math.max(height, Math.max(resultRight, resultLeft));

	}

	public static diameter_bt<Integer> create_tree() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		diameter_bt<Integer> root = new diameter_bt<>(data);
		System.out.println("Enter the left child of " + data);
		diameter_bt<Integer> leftroot = create_tree();
		System.out.println("Enter the right child of " + data);
		diameter_bt<Integer> rightroot = create_tree();
		root.left = leftroot;
		root.right = rightroot;
		return root;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Root");
		diameter_bt<Integer> root = create_tree();
		int re = calculate_diameter(root);
		System.out.println(re);
	}

}
