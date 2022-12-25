//----------------------- Time Complexity of This Program is O(n).
package Binary_Tree;

import java.util.Scanner;

class isBal {// ---------- Use in function.
	int height;
	boolean isTrue;
}

class check_balance_better<T> { // ------------Tree Class.
	T root;
	check_balance_better<T> left;
	check_balance_better<T> right;

	check_balance_better(T root) {
		this.root = root;
	}
}

public class Is_balanced_better { // ------------- Main Class.

	public static isBal check_isBalance(check_balance_better<Integer> root) {
		if (root == null) {
			isBal ans = new isBal();
			ans.height = 0;
			ans.isTrue = true;
			return ans;
		}
		isBal leftResult = check_isBalance(root.left);
		isBal rightResult = check_isBalance(root.right);

		boolean isEqual = true;
		int height = Math.max(leftResult.height, rightResult.height) + 1;

		if (Math.abs(leftResult.height - rightResult.height) > 1) {
			isEqual = false;
		}
		if (!leftResult.isTrue || !rightResult.isTrue) {
			isEqual = false;
		}
		isBal result = new isBal();
		result.height = height;
		result.isTrue = isEqual;

		return result;
	}

	public static check_balance_better<Integer> create_tree() {// ----------------- Create Tree
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		check_balance_better<Integer> root = new check_balance_better<>(data);
		System.out.println("Enter the left child of " + data);
		check_balance_better<Integer> leftroot = create_tree();
		System.out.println("Enter the right child of " + data);
		check_balance_better<Integer> rightroot = create_tree();
		root.left = leftroot;
		root.right = rightroot;

		return root;
	}

	public static void main(String[] args) {
		System.out.println("Enter the root");
		check_balance_better<Integer> root = create_tree();

		isBal result = check_isBalance(root);
		System.out.println("Is Tree Balanced " + result.isTrue); // ----- Print only the Boolean value.

	}

}
