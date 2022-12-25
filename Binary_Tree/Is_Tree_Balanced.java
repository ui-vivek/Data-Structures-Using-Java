//----------------------- Time Complexity of This Program is O(n^2) or O(n log n).
package Binary_Tree;

class check_balance<T> {
	T data;
	check_balance<T> left;
	check_balance<T> right;

	check_balance(T data) {
		this.data = data;
	}
}

public class Is_Tree_Balanced {
	public static int height(check_balance<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}

	public static boolean isBalanced(check_balance<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftHeight = height(root.left); // to check the height of the left sub-tree
		int rightHeight = height(root.right); // to check the height of the right sub-tree

		if (Math.abs(leftHeight - rightHeight) > 1) { // if the difference of left-sub-tree and right-sub-tree_
			return false; // is greater then 1 then the tree is not balanced _ return false;
		}
		boolean isLeftBalance = isBalanced(root.left); // check form the root .
		boolean isRightBalance = isBalanced(root.right);// check form the root .

		return isLeftBalance && isRightBalance; // if both are true then the tree is balanced .
	}

	public static void main(String[] args) {
//		            1
//			      /   \
//		         2     3
//		         \     /
//				  4   5
		check_balance<Integer> root = new check_balance<>(1);
		check_balance<Integer> root_left = new check_balance<>(2);
		check_balance<Integer> root_right = new check_balance<>(3);

		root.left = root_left;
		root.right = root_right;

		check_balance<Integer> root_left_right = new check_balance<>(4);
		check_balance<Integer> root_right_left = new check_balance<>(5);
		root_left.right = root_left_right; // See the diagram above to understand.
		root_right.left = root_right_left;
		// Tutorial video Link -
		// https://classroom.codingninjas.com/app/classroom/me/20311/content/409272/offering/5850201
		// ---------------------------------------------

		// A tree is balanced when the (difference of left-sub-tree and the
		// right-sub-tree is <=1) .
		System.out.println("Is Tree Balanced " + isBalanced(root));

	}
}
